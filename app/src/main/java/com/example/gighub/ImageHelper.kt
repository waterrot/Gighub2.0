import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView

fun changeImage(imageView: ImageView, image1ResId: Int, image2ResId: Int) {
    val fadeOut = AlphaAnimation(1f, 0f)
    fadeOut.duration = 100 // Set the duration of the fade animation

    fadeOut.setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationStart(animation: Animation?) {}
        override fun onAnimationRepeat(animation: Animation?) {}

        override fun onAnimationEnd(animation: Animation?) {
            if (imageView.tag == null || imageView.tag == image1ResId) {
                imageView.setImageResource(image2ResId)
                imageView.tag = image2ResId
            } else {
                imageView.setImageResource(image1ResId)
                imageView.tag = image1ResId
            }

            val fadeIn = AlphaAnimation(0f, 1f)
            fadeIn.duration = 100 // Set the duration of the fade animation
            imageView.startAnimation(fadeIn)
        }
    })

    imageView.startAnimation(fadeOut)
}
