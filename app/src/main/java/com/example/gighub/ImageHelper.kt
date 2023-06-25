package com.example.gighub
import android.widget.ImageView

fun changeImage(imageView: ImageView, image1ResId: Int, image2ResId: Int) {
    if (imageView.tag == null || imageView.tag == image1ResId) {
        imageView.setImageResource(image2ResId)
        imageView.tag = image2ResId
    } else {
        imageView.setImageResource(image1ResId)
        imageView.tag = image1ResId
    }
}
