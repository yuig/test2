package tb;

import androidx.recyclerview.widget.c3;
import ja.d0;

/* loaded from: classes.dex */
public final class n extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f116990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(d0 d0Var, int i13) {
        super(d0Var);
        this.f116990d = i13;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f116990d) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            default:
                return "DELETE FROM WorkProgress";
        }
    }
}
