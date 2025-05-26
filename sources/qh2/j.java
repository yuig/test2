package qh2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final y f103954a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f103955b = 0;

    public static Field a() {
        for (Field field : URL.class.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(URLStreamHandlerFactory.class)) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new IllegalStateException("Unable to detect static field in the URL class for the URLStreamHandlerFactory.");
    }

    public static void b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        nf2.g a13 = nf2.f.f90499e.a();
        if (a13 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        a13.logInternalError(error);
    }

    public static void c(boolean z13) {
        Boolean valueOf = Boolean.valueOf(z13);
        h.f103947e = valueOf;
        try {
            Object obj = a().get(null);
            if (obj == null) {
                URL.setURLStreamHandlerFactory(new i());
                return;
            }
            m mVar = new m((URLStreamHandlerFactory) obj, valueOf);
            try {
                a().set(null, null);
                URL.setURLStreamHandlerFactory(mVar);
            } catch (Exception e13) {
                m2.F1(e13);
                throw null;
            }
        } catch (Throwable th3) {
            b(th3);
            try {
                URL.setURLStreamHandlerFactory(new i());
            } catch (Throwable th4) {
                b(th4);
            }
        }
    }
}
