package u2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final j f120036i = new j(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        o oVar = (o) obj2;
        if (str.length() == 0) {
            return oVar.toString();
        }
        return str + ", " + oVar;
    }
}
