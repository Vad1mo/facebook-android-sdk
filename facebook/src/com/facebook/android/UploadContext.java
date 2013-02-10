package com.facebook.android;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

/**
 * Call Back showing the already transfered and total bytes send to FB
 * 
 *	@see {@link Util#uploadProgress}  to register your implementation 
 * <br/>
 * Example:
 * <p><blockquote><pre>
 *Util.uploadProgress = new UploadDataProgress(){
 *		public void progress(int totalBytes, int transferedBytes) {
 *			notification.contentView.setProgressBar(R.id.status_progress, totalBytes, transferedBytes, false);
 *			notificationManager.notify(42, notification);
 *		}
 *};
 * </pre></blockquote></p>
 */
public abstract class UploadContext extends Handler{
	
	public abstract Context getContext();
	
}