package jp2;

import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* loaded from: classes2.dex */
public final class u extends t {

    /* renamed from: p, reason: collision with root package name */
    public e0 f77384p;

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f77384p = new e0(libraryLoader);
        return this;
    }
}
