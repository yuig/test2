package an0;

import android.util.Size;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15683a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object obj, int i13) {
        super(0, obj, Size.class, "getWidth", "getWidth()I", 0);
        this.f15683a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, Size.class, "getWidth", "getWidth()I", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f15683a;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return Integer.valueOf(((Size) this.receiver).getWidth());
    }
}
