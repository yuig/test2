package l11;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.d0;
import u50.h0;

/* loaded from: classes5.dex */
public final class c extends LinearLayout implements yk1.n, ar0.b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f81382p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f81383a;

    /* renamed from: b, reason: collision with root package name */
    public final ProportionalImageView f81384b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f81385c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIcon f81386d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltAvatarGroup f81387e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIcon f81388f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIcon f81389g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f81390h;

    /* renamed from: i, reason: collision with root package name */
    public String f81391i;

    /* renamed from: j, reason: collision with root package name */
    public String f81392j;

    /* renamed from: k, reason: collision with root package name */
    public f11.c f81393k;

    /* renamed from: l, reason: collision with root package name */
    public f11.b f81394l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f81395m;

    /* renamed from: n, reason: collision with root package name */
    public int f81396n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f81397o;

    public c(Context context) {
        super(context);
        this.f81391i = "";
        this.f81392j = "";
        setId(f02.c.board_section_picker_board_cell);
        setImportantForAccessibility(2);
        setFocusable(false);
        View.inflate(context, f02.e.list_lego_cell_board_picker, this);
        this.f81383a = (GestaltText) findViewById(f02.c.header);
        this.f81384b = (ProportionalImageView) findViewById(f02.c.board_thumbnail);
        this.f81385c = (GestaltText) findViewById(f02.c.board_name);
        this.f81386d = (GestaltIcon) findViewById(f02.c.board_collab_iv);
        this.f81387e = (GestaltAvatarGroup) findViewById(f02.c.lego_board_rep_collaborator_chips);
        this.f81388f = (GestaltIcon) findViewById(f02.c.board_secret_iv);
        this.f81389g = (GestaltIcon) findViewById(f02.c.board_sections_iv);
        this.f81390h = (LinearLayout) findViewById(f02.c.board_info_wrapper);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f81390h.setPaddingRelative(0, 0, 0, 0);
        this.f81385c.i(new oo0.b(6));
        t.O(this.f81388f);
        t.O(this.f81386d);
        t.O(this.f81389g);
        this.f81383a.i(new oo0.b(13));
        setOnClickListener(new d0(11, this, context));
    }

    public final void a(String str) {
        if (this.f81384b != null) {
            if (j1.d1(str)) {
                this.f81384b.loadUrl(str);
            } else {
                this.f81384b.setImageDrawable(null);
                this.f81384b.setBackgroundColor(dl2.b.x0(getContext(), eo1.a.sema_color_background_secondary_default));
            }
        }
    }

    @Override // ar0.b
    public final boolean b() {
        return false;
    }

    public final void e(boolean z13, final int i13, List list, wy0 wy0Var) {
        if (!z13) {
            this.f81386d.g2(new bp.d(z13, 7));
            return;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new sl1.e(wy0Var.l3() == null ? "default_" : wy0Var.l3(), wy0Var.getUid(), wy0Var.U2(), wy0Var.q2()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wy0 wy0Var2 = (wy0) it.next();
            arrayList.add(new sl1.e(wy0Var2.l3() == null ? "default_" : wy0Var2.l3(), wy0Var2.getUid(), wy0Var2.U2(), wy0Var.q2()));
        }
        final sl1.h hVar = sl1.h.SM;
        this.f81387e.a(new Function1() { // from class: l11.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new sl1.i(arrayList, i13, hVar, false, sl1.f.THREE, fm1.c.VISIBLE, Integer.MIN_VALUE, h0.f120562a);
            }
        });
    }

    public final void g(boolean z13) {
        this.f81395m = z13;
        this.f81389g.g2(new bp.d(z13, 6));
        if (this.f81395m) {
            final int i13 = 0;
            this.f81385c.i(new Function1(this) { // from class: l11.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f81378b;

                {
                    this.f81378b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i14 = i13;
                    c cVar = this.f81378b;
                    switch (i14) {
                        case 0:
                            rn1.a displayState = (rn1.a) obj;
                            cVar.getClass();
                            Intrinsics.checkNotNullParameter(displayState, "displayState");
                            return new rn1.a(displayState.f108849g, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, bs1.c.j2(new String[]{cVar.f81392j}, f02.g.double_tap_to_open_sections), displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
                        default:
                            rn1.a displayState2 = (rn1.a) obj;
                            cVar.getClass();
                            Intrinsics.checkNotNullParameter(displayState2, "displayState");
                            return new rn1.a(displayState2.f108849g, displayState2.f108850h, displayState2.f108851i, displayState2.f108852j, displayState2.f108853k, displayState2.f108854l, displayState2.f108855m, displayState2.f108856n, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, bs1.c.j2(new String[]{cVar.f81392j}, f02.g.double_tap_to_save_to_board), displayState2.f108862t, displayState2.f108863u, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
                    }
                }
            });
        } else {
            final int i14 = 1;
            this.f81385c.i(new Function1(this) { // from class: l11.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f81378b;

                {
                    this.f81378b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i142 = i14;
                    c cVar = this.f81378b;
                    switch (i142) {
                        case 0:
                            rn1.a displayState = (rn1.a) obj;
                            cVar.getClass();
                            Intrinsics.checkNotNullParameter(displayState, "displayState");
                            return new rn1.a(displayState.f108849g, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, bs1.c.j2(new String[]{cVar.f81392j}, f02.g.double_tap_to_open_sections), displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
                        default:
                            rn1.a displayState2 = (rn1.a) obj;
                            cVar.getClass();
                            Intrinsics.checkNotNullParameter(displayState2, "displayState");
                            return new rn1.a(displayState2.f108849g, displayState2.f108850h, displayState2.f108851i, displayState2.f108852j, displayState2.f108853k, displayState2.f108854l, displayState2.f108855m, displayState2.f108856n, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, bs1.c.j2(new String[]{cVar.f81392j}, f02.g.double_tap_to_save_to_board), displayState2.f108862t, displayState2.f108863u, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
                    }
                }
            });
        }
    }
}
