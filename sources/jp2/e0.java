package jp2;

import org.chromium.net.CronetEngine;

/* loaded from: classes4.dex */
public final class e0 extends CronetEngine.Builder.LibraryLoader {

    /* renamed from: a, reason: collision with root package name */
    public final CronetEngine.Builder.LibraryLoader f77323a;

    public e0(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f77323a = libraryLoader;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        this.f77323a.loadLibrary(str);
    }
}
