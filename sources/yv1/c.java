package yv1;

import en1.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f140220j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f140221k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140222i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f140222i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f140222i) {
            case 0:
                en1.d it = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return en1.d.e(it, null, null, null, false, null, e0.f59666a, false, 0, 447);
            default:
                jb2.b it2 = (jb2.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return jb2.b.e(it2, null, null, false, 0.0f, null, false, jb2.e.f75367b, 0, 383);
        }
    }
}
