package qh2;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/* loaded from: classes4.dex */
public final class m implements URLStreamHandlerFactory {

    /* renamed from: a, reason: collision with root package name */
    public final URLStreamHandlerFactory f103963a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f103964b;

    public m(URLStreamHandlerFactory uRLStreamHandlerFactory, Boolean bool) {
        this.f103963a = uRLStreamHandlerFactory;
        this.f103964b = bool;
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        try {
            URLStreamHandler createURLStreamHandler = this.f103963a.createURLStreamHandler(str);
            return createURLStreamHandler == null ? new i().createURLStreamHandler(str) : new l(this, createURLStreamHandler);
        } catch (Exception e13) {
            j.b(e13);
            return new i().createURLStreamHandler(str);
        }
    }
}
