package a;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface n8 {
    Object a(String str, String str2, bl2.c cVar);

    Object a(nm.u uVar, String str, bl2.c cVar);

    default Object b(nm.u uVar, String str, bl2.c cVar) {
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return a(str, sVar, cVar);
    }
}
