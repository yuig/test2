package gg0;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GlideWebImageView;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import zp.y0;

/* loaded from: classes5.dex */
public final class e0 extends y2 {
    public static final /* synthetic */ int E = 0;
    public final View A;
    public final View B;
    public final GestaltText C;
    public final LinkedHashSet D;

    /* renamed from: u, reason: collision with root package name */
    public final i0 f64922u;

    /* renamed from: v, reason: collision with root package name */
    public final GlideWebImageView f64923v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f64924w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f64925x;

    /* renamed from: y, reason: collision with root package name */
    public final View f64926y;

    /* renamed from: z, reason: collision with root package name */
    public final View f64927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(View itemView, i0 selectionListener) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(selectionListener, "selectionListener");
        this.f64922u = selectionListener;
        this.f64923v = (GlideWebImageView) itemView.findViewById(jg0.c.banner);
        this.f64924w = (GestaltText) itemView.findViewById(jg0.c.title);
        this.f64925x = (GestaltText) itemView.findViewById(jg0.c.subtitle);
        this.f64926y = itemView.findViewById(jg0.c.info_item1);
        this.f64927z = itemView.findViewById(jg0.c.info_item2);
        this.A = itemView.findViewById(jg0.c.selection_item1);
        this.B = itemView.findViewById(jg0.c.selection_item2);
        this.C = (GestaltText) itemView.findViewById(jg0.c.additional_text);
        this.D = new LinkedHashSet();
    }

    public static void k0(rg0.i iVar, View view) {
        GestaltText gestaltText = (GestaltText) view.findViewById(jg0.c.info_label);
        View findViewById = view.findViewById(jg0.c.info_icon_container);
        GestaltIcon gestaltIcon = (GestaltIcon) view.findViewById(jg0.c.info_icon);
        rg0.h hVar = iVar.f108028b;
        if (hVar != null) {
            rm1.q qVar = hVar.f108024a;
            int i13 = qVar == null ? -1 : b0.f64913a[qVar.ordinal()];
            if (i13 == 1) {
                findViewById.setBackgroundResource(jg0.b.circle_bg_sparkle);
            } else if (i13 == 2) {
                findViewById.setBackgroundResource(jg0.b.circke_bg_audio_mix);
            }
            Intrinsics.f(gestaltIcon);
            dl2.b.z(gestaltIcon, new d0(hVar, 1));
        }
        Intrinsics.f(gestaltText);
        r0(gestaltText, iVar.f108027a);
    }

    public static void r0(GestaltText gestaltText, rg0.l lVar) {
        if (lVar != null) {
            pp2.a.k(gestaltText, new v(lVar, 3));
        }
    }

    public final void o0(rg0.k kVar, View view, c0 c0Var) {
        GestaltText gestaltText = (GestaltText) view.findViewById(jg0.c.title);
        GestaltText gestaltText2 = (GestaltText) view.findViewById(jg0.c.subtitle);
        GestaltRadioButton gestaltRadioButton = (GestaltRadioButton) view.findViewById(jg0.c.radio);
        LinkedHashSet linkedHashSet = this.D;
        Intrinsics.f(gestaltRadioButton);
        linkedHashSet.add(gestaltRadioButton);
        view.setOnClickListener(new y0(c0Var, gestaltRadioButton, kVar, 3));
        Intrinsics.f(gestaltText);
        r0(gestaltText, kVar.f108040a);
        Intrinsics.f(gestaltText2);
        r0(gestaltText2, kVar.f108041b);
    }
}
