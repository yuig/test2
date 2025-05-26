package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public class n2 implements h4.y {

    /* renamed from: a, reason: collision with root package name */
    public final int f25001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25002b;

    public n2(int i13) {
        if (i13 == 4) {
            this.f25001a = 1048576;
            this.f25002b = 1024;
        } else {
            if (i13 != 7) {
                return;
            }
            this.f25001a = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            this.f25002b = Integer.MAX_VALUE;
        }
    }

    @Override // h4.y
    public int a(int i13) {
        if (i13 >= 0 && i13 <= this.f25002b) {
            w1.g1.F(i13, this.f25001a, i13);
        }
        return i13;
    }

    @Override // h4.y
    public int b(int i13) {
        if (i13 >= 0 && i13 <= this.f25001a) {
            w1.g1.E(i13, this.f25002b, i13);
        }
        return i13;
    }

    public /* synthetic */ n2(int i13, int i14) {
        this.f25001a = i13;
        this.f25002b = i14;
    }
}
