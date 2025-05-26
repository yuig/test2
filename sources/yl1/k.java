package yl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f139345j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f139346k = new k(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139347i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f139347i = i13;
    }

    public final b b(b it) {
        switch (this.f139347i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.f(it, null, false, fm1.c.INVISIBLE, null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.f(it, null, false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f139347i) {
        }
        return b((b) obj);
    }
}
