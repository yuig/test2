package tb;

import androidx.recyclerview.widget.c3;
import ja.d0;

/* loaded from: classes.dex */
public final class u extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f117042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(d0 d0Var, int i13) {
        super(d0Var);
        this.f117042d = i13;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f117042d) {
            case 0:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 1:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case 2:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case 3:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 4:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 5:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 6:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 7:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 8:
                return "DELETE FROM workspec WHERE id=?";
            case 9:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 10:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case 11:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 12:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 13:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            default:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }
}
