import numpy as np
import cv2
from matplotlib import pyplot as plt

#get image source
img = cv2.imread('testimage.jpg')

#prep for Denoising
b,g,r = cv2.split(img)           # get b,g,r
rgb_img = cv2.merge([r,g,b])     # switch it to rgb

# Denoising - Non-Colored
dst = cv2.fastNlMeansDenoising(img,None,10,7,21)

b,g,r = cv2.split(dst)           # get b,g,r
rgb_dst = cv2.merge([r,g,b])     # switch it to rgb

#GussianBlur
blur = cv2.GaussianBlur(rgb_dst,(5,5),0)

#show result
plt.subplot(211),plt.imshow(rgb_dst),plt.title('B&W Noise Canceled')
plt.subplot(212),plt.imshow(blur),plt.title('B&W Noise Canceled + GaussianBlur')
plt.show()