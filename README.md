# ProgressDialog
A dialog with a revolving progress bar.

![GIF](https://github.com/cdreamplayer/ProgressDialog/blob/master/show/show.gif)

## Add ProgressDialog to your project.
    
    // project.gradle
    dependencies {
      ...
      maven { url 'https://jitpack.io' }
    }

    // *.gradle
    implementation 'com.github.cdreamplayer:ProgressDialog:1.0.0'

## How to use it 

    val dialog = BlackMessageDialog(context, msg)
    dialog.show()
