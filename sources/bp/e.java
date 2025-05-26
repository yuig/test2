package bp;

import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.qc;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;

/* loaded from: classes3.dex */
public abstract class e extends y2 implements View.OnClickListener {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u, reason: collision with root package name */
    public Object f23624u;

    /* renamed from: v, reason: collision with root package name */
    public GestaltAvatar f23625v;

    /* renamed from: w, reason: collision with root package name */
    public GestaltText f23626w;

    /* renamed from: x, reason: collision with root package name */
    public GestaltText f23627x;

    /* renamed from: y, reason: collision with root package name */
    public ImageButton f23628y;

    /* renamed from: z, reason: collision with root package name */
    public GestaltButton f23629z;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        kg.n.a(view);
        Object obj = this.f23624u;
        if (obj != null) {
            s sVar = (s) obj;
            k kVar = (k) this;
            int i13 = kVar.B;
            g gVar = kVar.C;
            switch (i13) {
                case 0:
                    ((xo.i) ((l) gVar).f23632f).g(((qc) sVar).f41259b);
                    break;
                default:
                    ((xo.i) ((o) gVar).f23632f).g((wy0) sVar);
                    break;
            }
        }
    }
}
