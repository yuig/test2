package lq0;

import android.widget.LinearLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84246i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f84247j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i13) {
        super(0);
        this.f84246i = i13;
        this.f84247j = b0Var;
    }

    public final LinearLayout b() {
        int i13 = this.f84246i;
        b0 b0Var = this.f84247j;
        switch (i13) {
            case 1:
                return (LinearLayout) b0Var.findViewById(xc0.e.copy_icon_button);
            case 2:
                return (LinearLayout) b0Var.findViewById(xc0.e.delete_icon_button);
            case 3:
                return (LinearLayout) b0Var.findViewById(xc0.e.reply_icon_button);
            case 4:
                return (LinearLayout) b0Var.findViewById(xc0.e.save_and_share_section);
            case 5:
                return (LinearLayout) b0Var.findViewById(xc0.e.save_icon_button);
            default:
                return (LinearLayout) b0Var.findViewById(xc0.e.share_icon_button);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b0 b0Var = this.f84247j;
        int i13 = this.f84246i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (PinterestRecyclerView) b0Var.findViewById(xc0.e.all_users_reactions_display);
                    default:
                        return (PinterestRecyclerView) b0Var.findViewById(xc0.e.selectable_reactions);
                }
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                switch (i13) {
                    case 0:
                        return (PinterestRecyclerView) b0Var.findViewById(xc0.e.all_users_reactions_display);
                    default:
                        return (PinterestRecyclerView) b0Var.findViewById(xc0.e.selectable_reactions);
                }
            default:
                return b();
        }
    }
}
