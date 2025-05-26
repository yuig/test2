package lp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.conversation.view.GroupUserImageViewV2;
import com.pinterest.activity.sendapin.ui.PersonListCell;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zq;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.reps.pinner.PinnerGridCell;
import java.util.ArrayList;
import java.util.List;
import kh2.g0;
import kh2.k3;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import qv0.r;
import qv0.s;
import z40.d0;

/* loaded from: classes3.dex */
public final class a extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f84199g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84200a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f84201b;

    /* renamed from: c, reason: collision with root package name */
    public List f84202c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f84203d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f84204e;

    /* renamed from: f, reason: collision with root package name */
    public final Cloneable f84205f;

    public a(Context context, ArrayList data, nv0.b actionListener, com.bumptech.glide.l animatedGifLoader) {
        this.f84200a = 1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        Intrinsics.checkNotNullParameter(animatedGifLoader, "animatedGifLoader");
        this.f84201b = context;
        this.f84202c = data;
        this.f84204e = actionListener;
        this.f84203d = false;
        this.f84205f = animatedGifLoader;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        switch (this.f84200a) {
        }
        return this.f84202c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        switch (this.f84200a) {
            case 0:
                if (i13 < 0 || i13 >= getCount()) {
                    return null;
                }
                return this.f84202c.get(i13);
            default:
                return (zq) this.f84202c.get(i13);
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        switch (this.f84200a) {
            case 0:
                return i13;
            default:
                String uid = ((zq) this.f84202c.get(i13)).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                return Long.parseLong(uid);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        PersonListCell personListCell;
        bp1.g gVar;
        r rVar;
        int i14 = this.f84200a;
        boolean z13 = this.f84203d;
        switch (i14) {
            case 0:
                int i15 = 1;
                CharSequence charSequence = null;
                int i16 = 0;
                if (view instanceof PersonListCell) {
                    personListCell = (PersonListCell) view;
                    personListCell.b(null);
                    PinnerGridCell pinnerGridCell = personListCell.f35164d;
                    GestaltText gestaltText = pinnerGridCell.f52220i;
                    if (gestaltText != null) {
                        gestaltText.i(new ea2.a(i15, charSequence));
                        pinnerGridCell.j();
                        pinnerGridCell.i();
                    }
                    k3.R1(personListCell.f35164d, false);
                } else {
                    LayoutInflater layoutInflater = (LayoutInflater) this.f84204e;
                    PersonListCell personListCell2 = (PersonListCell) layoutInflater.inflate(xc0.f.list_cell_person_divider, viewGroup, false);
                    if (personListCell2 != null) {
                        Context context = layoutInflater.getContext();
                        int i17 = eo1.b.color_themed_background_elevation_floating;
                        Object obj = d5.a.f53679a;
                        personListCell2.setBackgroundColor(context.getColor(i17));
                    }
                    personListCell = personListCell2;
                }
                d0 d0Var = (d0) getItem(i13);
                if (d0Var != null && personListCell != null) {
                    personListCell.b(d0Var.f());
                    personListCell.b(d0Var.f());
                    k3.R1(personListCell.f35164d, true);
                    PinnerGridCell pinnerGridCell2 = personListCell.f35164d;
                    pinnerGridCell2.f52216e = rl1.r.LG;
                    pinnerGridCell2.f52224m = true;
                    pinnerGridCell2.f52215d = d0Var;
                    pinnerGridCell2.f52217f.removeAllViews();
                    pinnerGridCell2.f52219h.i(new ea2.a(i16, pinnerGridCell2.f52215d.f() != null ? pinnerGridCell2.f52215d.f() : ""));
                    pinnerGridCell2.j();
                    pinnerGridCell2.i();
                    GroupUserImageViewV2 groupUserImageViewV2 = pinnerGridCell2.f52217f;
                    d0 user = pinnerGridCell2.f52215d;
                    GestaltAvatar m13 = m0.m(groupUserImageViewV2.getContext(), pinnerGridCell2.f52216e, true);
                    groupUserImageViewV2.f34883a = m13;
                    Intrinsics.checkNotNullParameter(m13, "<this>");
                    Intrinsics.checkNotNullParameter(user, "user");
                    Intrinsics.checkNotNullParameter(user, "user");
                    if (user instanceof d0) {
                        gVar = new bp1.g(new bp1.d(user));
                    } else {
                        if (!(user instanceof wy0)) {
                            throw new IllegalArgumentException("User type not allowed " + user);
                        }
                        gVar = new bp1.g(new bp1.e((wy0) user));
                    }
                    m0.U0(m13, gVar);
                    GestaltAvatar gestaltAvatar = groupUserImageViewV2.f34883a;
                    gestaltAvatar.H2(new xo.j(9));
                    groupUserImageViewV2.addView(gestaltAvatar);
                    int i18 = 5;
                    co.a aVar = new co.a(i18, this, d0Var);
                    if (personListCell.f35163c == null) {
                        GestaltCheckBox gestaltCheckBox = (GestaltCheckBox) LayoutInflater.from(personListCell.f35161a).inflate(w42.b.view_checkbox, (ViewGroup) null);
                        personListCell.f35163c = gestaltCheckBox;
                        personListCell.f35162b.addView(gestaltCheckBox);
                    }
                    GestaltCheckBox gestaltCheckBox2 = personListCell.f35163c;
                    if (gestaltCheckBox2 != null) {
                        bp.j jVar = new bp.j(i18, personListCell, aVar);
                        gestaltCheckBox2.L(new yq.k(2, z13 ? em1.b.CHECKED : em1.b.UNCHECKED, fm1.c.VISIBLE));
                        c0.d.l(personListCell.f35163c, new gr.a(jVar, 0));
                    }
                }
                return personListCell;
            default:
                Cloneable cloneable = this.f84205f;
                if (i13 == 3 && z13) {
                    s sVar = new s(this.f84201b, (com.bumptech.glide.l) cloneable);
                    zq zqVar = (zq) this.f84202c.get(i13);
                    boolean e03 = g0.e0(zqVar);
                    r rVar2 = sVar.f105203a;
                    if (e03) {
                        String thumbnailUrl = zqVar.y();
                        Intrinsics.checkNotNullExpressionValue(thumbnailUrl, "getThumbnailImageURL(...)");
                        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
                        rVar2.a(thumbnailUrl);
                    } else {
                        String thumbnailUrl2 = zqVar.y();
                        Intrinsics.checkNotNullExpressionValue(thumbnailUrl2, "getThumbnailImageURL(...)");
                        Intrinsics.checkNotNullParameter(thumbnailUrl2, "thumbnailUrl");
                        rVar2.b(thumbnailUrl2);
                    }
                    sVar.setOnClickListener(new oq.m(4));
                    rVar = sVar;
                } else {
                    r rVar3 = new r(this.f84201b, (com.bumptech.glide.l) cloneable);
                    zq zqVar2 = (zq) this.f84202c.get(i13);
                    if (g0.e0(zqVar2)) {
                        String y13 = zqVar2.y();
                        Intrinsics.checkNotNullExpressionValue(y13, "getThumbnailImageURL(...)");
                        rVar3.a(y13);
                    } else {
                        String y14 = zqVar2.y();
                        Intrinsics.checkNotNullExpressionValue(y14, "getThumbnailImageURL(...)");
                        rVar3.b(y14);
                    }
                    rVar3.setOnClickListener(new xa0.m(29, this, zqVar2));
                    rVar = rVar3;
                }
                return rVar;
        }
    }

    public a(Context context, boolean z13) {
        this.f84200a = 0;
        this.f84205f = new ArrayList();
        this.f84201b = context;
        this.f84204e = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f84203d = z13;
    }
}
