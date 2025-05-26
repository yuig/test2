package tb;

import androidx.recyclerview.widget.c3;
import ja.d0;

/* loaded from: classes.dex */
public final class h extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f116975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f116976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, d0 d0Var, int i13) {
        super(d0Var);
        this.f116975d = i13;
        this.f116976e = obj;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f116975d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }
}
