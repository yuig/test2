package bp;

import android.view.View;
import android.widget.ImageButton;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;

/* loaded from: classes3.dex */
public final class k extends e {
    public static final /* synthetic */ int D = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ g C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, View view, int i13) {
        super(view);
        this.B = i13;
        this.C = gVar;
        this.f23625v = (GestaltAvatar) view.findViewById(vc0.b.cell_image);
        this.f23626w = (GestaltText) view.findViewById(vc0.b.cell_title);
        this.f23627x = (GestaltText) view.findViewById(vc0.b.cell_desc);
        this.f23628y = (ImageButton) view.findViewById(vc0.b.action_btn);
        this.f23629z = (GestaltButton) view.findViewById(vc0.b.approve_btn);
        this.f23626w.i(new xo.j(5));
        this.f23627x.i(new xo.j(6));
        view.setOnClickListener(this);
    }

    @Override // bp.e, android.view.View.OnClickListener
    public final /* bridge */ /* synthetic */ void onClick(View view) {
        switch (this.B) {
            case 0:
                kg.n.a(view);
                super.onClick(view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }
}
