package h6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: j */
    public static final Object f67727j = new Object();

    /* renamed from: k */
    public static volatile m f67728k;

    /* renamed from: a */
    public final ReentrantReadWriteLock f67729a;

    /* renamed from: b */
    public final g1.h f67730b;

    /* renamed from: c */
    public volatile int f67731c;

    /* renamed from: d */
    public final Handler f67732d;

    /* renamed from: e */
    public final g f67733e;

    /* renamed from: f */
    public final l f67734f;

    /* renamed from: g */
    public final e3.e f67735g;

    /* renamed from: h */
    public final int f67736h;

    /* renamed from: i */
    public final e f67737i;

    public m(a0 a0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f67729a = reentrantReadWriteLock;
        this.f67731c = 3;
        this.f67734f = a0Var.f67719a;
        int i13 = a0Var.f67720b;
        this.f67736h = i13;
        this.f67737i = a0Var.f67721c;
        this.f67732d = new Handler(Looper.getMainLooper());
        this.f67730b = new g1.h(0);
        this.f67735g = new e3.e();
        g gVar = new g(this, 12);
        this.f67733e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i13 == 0) {
            try {
                this.f67731c = 0;
            } catch (Throwable th3) {
                this.f67729a.writeLock().unlock();
                throw th3;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            gVar.G();
        }
    }

    public static m a() {
        m mVar;
        synchronized (f67727j) {
            mVar = f67728k;
            com.bumptech.glide.d.v("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", mVar != null);
        }
        return mVar;
    }

    public static boolean c() {
        return f67728k != null;
    }

    public final int b() {
        this.f67729a.readLock().lock();
        try {
            return this.f67731c;
        } finally {
            this.f67729a.readLock().unlock();
        }
    }

    public final void d() {
        com.bumptech.glide.d.v("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f67736h == 1);
        if (b() == 1) {
            return;
        }
        this.f67729a.writeLock().lock();
        try {
            if (this.f67731c == 0) {
                return;
            }
            this.f67731c = 0;
            this.f67729a.writeLock().unlock();
            this.f67733e.G();
        } finally {
            this.f67729a.writeLock().unlock();
        }
    }

    public final void e(Throwable th3) {
        ArrayList arrayList = new ArrayList();
        this.f67729a.writeLock().lock();
        try {
            this.f67731c = 2;
            arrayList.addAll(this.f67730b);
            this.f67730b.clear();
            this.f67729a.writeLock().unlock();
            this.f67732d.post(new k(arrayList, this.f67731c, th3));
        } catch (Throwable th4) {
            this.f67729a.writeLock().unlock();
            throw th4;
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.f67729a.writeLock().lock();
        try {
            this.f67731c = 1;
            arrayList.addAll(this.f67730b);
            this.f67730b.clear();
            this.f67729a.writeLock().unlock();
            this.f67732d.post(new k(arrayList, this.f67731c, null));
        } catch (Throwable th3) {
            this.f67729a.writeLock().unlock();
            throw th3;
        }
    }

    public final CharSequence g(int i13, int i14, CharSequence charSequence, int i15) {
        com.bumptech.glide.d.v("Not initialized yet", b() == 1);
        if (i13 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        com.bumptech.glide.d.g("start should be <= than end", i13 <= i14);
        if (charSequence == null) {
            return null;
        }
        com.bumptech.glide.d.g("start should be < than charSequence length", i13 <= charSequence.length());
        com.bumptech.glide.d.g("end should be < than charSequence length", i14 <= charSequence.length());
        if (charSequence.length() == 0 || i13 == i14) {
            return charSequence;
        }
        return this.f67733e.H(charSequence, i13, i14, i15 == 1);
    }

    public final void h(j jVar) {
        com.bumptech.glide.d.s(jVar, "initCallback cannot be null");
        this.f67729a.writeLock().lock();
        try {
            if (this.f67731c != 1 && this.f67731c != 2) {
                this.f67730b.add(jVar);
                this.f67729a.writeLock().unlock();
            }
            this.f67732d.post(new k(jVar, this.f67731c));
            this.f67729a.writeLock().unlock();
        } catch (Throwable th3) {
            this.f67729a.writeLock().unlock();
            throw th3;
        }
    }

    public final void i(j6.j jVar) {
        com.bumptech.glide.d.s(jVar, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f67729a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f67730b.remove(jVar);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public final void j(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f67733e.I(editorInfo);
    }
}
