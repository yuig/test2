package gm2;

import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f65753a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static tb.l f65754b;

    public static tb.l a(Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new tb.l(17, cls.getMethod("getParameters", new Class[0]), d.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new tb.l(17, null, null);
        }
    }
}
