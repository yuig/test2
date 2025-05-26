package tn2;

import am2.b1;
import am2.c1;
import am2.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pn2.v1;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f118626i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v1 it = (v1) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        j b13 = it.w0().b();
        boolean z13 = false;
        if (b13 != null) {
            Intrinsics.checkNotNullParameter(b13, "<this>");
            if ((b13 instanceof c1) && (((c1) b13).g() instanceof b1)) {
                z13 = true;
            }
        }
        return Boolean.valueOf(z13);
    }
}
