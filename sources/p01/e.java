package p01;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wt1.c0;
import wt1.y;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f98358j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f98359k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98360i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f98360i = i13;
    }

    public final Boolean b(c0 it) {
        boolean z13 = true;
        switch (this.f98360i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof wt1.m) && !(it instanceof y) && !(it instanceof wt1.i)) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof y) && !(it instanceof wt1.m) && !(it instanceof wt1.i)) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f98360i) {
        }
        return b((c0) obj);
    }
}
