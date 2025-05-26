package h6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes.dex */
public final class n implements androidx.lifecycle.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.s f67738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f67739b;

    public n(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.s sVar) {
        this.f67739b = emojiCompatInitializer;
        this.f67738a = sVar;
    }

    @Override // androidx.lifecycle.f
    public final void onResume(androidx.lifecycle.z zVar) {
        this.f67739b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new r(0), 500L);
        this.f67738a.b(this);
    }
}
