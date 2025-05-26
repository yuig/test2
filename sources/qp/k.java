package qp;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w0;
import androidx.lifecycle.z;
import com.pinterest.activity.create.view.FloatingBoardPicker;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.BoardCreateOrPickerNavigation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import cp.t;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import jk2.l1;
import kg.o;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l11.r;
import m60.x0;
import nx.d0;
import pk.a0;
import qa2.o1;
import qa2.p1;
import r1.j0;
import tb0.p;
import x02.i2;
import x02.y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lqp/k;", "Lnl1/d;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lqa2/o1;", "", "Lop/a;", "Lqp/c;", "Lqp/b;", "Lk11/e;", "<init>", "()V", "g4/u", "pinIt_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends a implements AdapterView.OnItemClickListener, o1, op.a, c, b, k11.e {
    public static final /* synthetic */ int L0 = 0;
    public y A0;
    public i2 B0;
    public i92.k C0;
    public g70.h D0;
    public k11.d E0;
    public String F0;
    public String G0;
    public boolean H0;
    public String I0;

    /* renamed from: c0, reason: collision with root package name */
    public op.b f104694c0;

    /* renamed from: d0, reason: collision with root package name */
    public PinterestGridView f104695d0;

    /* renamed from: e0, reason: collision with root package name */
    public Bundle f104696e0;

    /* renamed from: f0, reason: collision with root package name */
    public AdapterEmptyView f104697f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f104698g0;

    /* renamed from: h0, reason: collision with root package name */
    public ViewGroup f104699h0;

    /* renamed from: i0, reason: collision with root package name */
    public FloatingBoardPicker f104700i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltCheckBox f104701j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltButton f104702k0;

    /* renamed from: l0, reason: collision with root package name */
    public PinnableImageFeed f104703l0;

    /* renamed from: m0, reason: collision with root package name */
    public String f104704m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f104705n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f104706o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f104707p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f104708q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f104709r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f104710s0;

    /* renamed from: v0, reason: collision with root package name */
    public e02.a f104713v0;

    /* renamed from: w0, reason: collision with root package name */
    public lu1.b f104714w0;

    /* renamed from: x0, reason: collision with root package name */
    public il1.a f104715x0;

    /* renamed from: y0, reason: collision with root package name */
    public z12.d f104716y0;

    /* renamed from: z0, reason: collision with root package name */
    public b60.b f104717z0;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f104711t0 = new LinkedHashSet();

    /* renamed from: u0, reason: collision with root package name */
    public final HashSet f104712u0 = new HashSet();
    public final h80.h J0 = new h80.h(this, 0);
    public final d K0 = new d(this, 2);

    @Override // nl1.d, fo1.i
    public final void I3() {
        PinterestGridView pinterestGridView = this.f104695d0;
        if (pinterestGridView == null) {
            return;
        }
        pinterestGridView.t0(0);
    }

    @Override // nl1.d
    public final void K7() {
        super.K7();
        PinterestGridView pinterestGridView = this.f104695d0;
        if (pinterestGridView != null) {
            pinterestGridView.I0();
            if (pinterestGridView.K0() != null) {
                pinterestGridView.K0().f();
            }
        }
    }

    @Override // nl1.d
    public final void L7() {
        PinterestGridView pinterestGridView = this.f104695d0;
        if (pinterestGridView != null && pinterestGridView.K0() != null) {
            pinterestGridView.K0().g();
        }
        super.L7();
    }

    @Override // k11.e
    public final String N3(Uri uri, Bitmap bitmap, boolean z13) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String c13 = qb0.b.c(requireContext(), uri, bitmap, null, null, z13);
        Intrinsics.checkNotNullExpressionValue(c13, "decodeImageUri(...)");
        return c13;
    }

    @Override // k11.e
    public final String X1() {
        Bundle extras;
        FragmentActivity E4 = E4();
        if (E4 == null || (extras = E4.getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("com.pinterest.EXTRA_PARTNER_ID");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y7(ArrayList arrayList) {
        BoardCreateOrPickerNavigation boardCreateOrPickerNavigation = new BoardCreateOrPickerNavigation(arrayList);
        gw gwVar = fw.f37821a;
        String str = ((PinnableImage) arrayList.get(0)).f35564a;
        gwVar.getClass();
        f30 d2 = gw.d(str);
        String z13 = z1();
        if (z13 == null) {
            z13 = "in_app_browser";
        }
        String str2 = z13;
        boolean d13 = Intrinsics.d(z1(), "scraped");
        a4 p03 = getP0();
        String name = p03 != null ? p03.name() : null;
        e02.a aVar = this.f104713v0;
        if (aVar == null) {
            Intrinsics.r("boardRouter");
            throw null;
        }
        il1.a aVar2 = this.f104715x0;
        if (aVar2 == null) {
            Intrinsics.r("fragmentFactory");
            throw null;
        }
        nl1.d a13 = e02.a.a(aVar, d2, aVar2, str2, boardCreateOrPickerNavigation, this.f104706o0, this.f104707p0, this.f104708q0, this.f104709r0, name);
        if ((a13 instanceof r) && d13) {
            ((l11.j) ((r) a13)).E1 = "large";
        }
        FragmentActivity E4 = E4();
        if (E4 == null || a13 == 0) {
            return;
        }
        a13.setArguments(getArguments());
        ViewParent parent = requireView().getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int id3 = ((ViewGroup) parent).getId();
        w0 supportFragmentManager = E4.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        mo1.c.b(supportFragmentManager, id3, a13, false, mo1.a.MODAL, "");
    }

    @Override // nl1.d
    public final boolean Z6() {
        return false;
    }

    public final void Z7() {
        PinnableImageFeed pinnableImageFeed = this.f104703l0;
        if (pinnableImageFeed != null) {
            GestaltText gestaltText = this.f104698g0;
            if (gestaltText == null) {
                Intrinsics.r("headerVw");
                throw null;
            }
            gestaltText.i(h.f104688o);
            PinterestGridView pinterestGridView = this.f104695d0;
            if (pinterestGridView != null) {
                pinterestGridView.p1(this);
                pinterestGridView.b1(pinnableImageFeed);
                pinterestGridView.s1(p1.LOADED);
            }
            if (pinnableImageFeed.q().size() <= 1 || this.f104708q0 != null) {
                return;
            }
            this.f104710s0 = true;
        }
    }

    public final void a8(boolean z13) {
        op.b bVar;
        HashSet hashSet = this.f104712u0;
        if (hashSet.isEmpty() == z13 || (bVar = this.f104694c0) == null) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f104711t0;
        if (z13) {
            linkedHashSet.addAll(hashSet);
            hashSet.clear();
        } else {
            linkedHashSet.clear();
            PinnableImageFeed pinnableImageFeed = this.f104703l0;
            if (pinnableImageFeed != null) {
                List q13 = pinnableImageFeed.q();
                Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
                hashSet.addAll(q13);
            }
        }
        i8();
        bVar.notifyDataSetChanged();
        h8();
    }

    public final void b8(p1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == p1.LOADING) {
            GestaltText gestaltText = this.f104698g0;
            if (gestaltText != null) {
                gestaltText.i(new f(this, 3));
                return;
            } else {
                Intrinsics.r("headerVw");
                throw null;
            }
        }
        if (this.f104710s0) {
            h8();
            return;
        }
        if (this.f104705n0) {
            GestaltText gestaltText2 = this.f104698g0;
            if (gestaltText2 != null) {
                gestaltText2.i(h.f104685l);
                return;
            } else {
                Intrinsics.r("headerVw");
                throw null;
            }
        }
        GestaltText gestaltText3 = this.f104698g0;
        if (gestaltText3 != null) {
            gestaltText3.i(h.f104686m);
        } else {
            Intrinsics.r("headerVw");
            throw null;
        }
    }

    public final void c8(PinnableImage pinnableImage) {
        Intrinsics.checkNotNullParameter(pinnableImage, "pinnableImage");
        CharSequence h10 = pinnableImage.h();
        if (h10 == null || h10.length() == 0) {
            Y7(new ArrayList(e0.b(pinnableImage)));
            return;
        }
        if (pinnableImage.j() != null) {
            g70.h hVar = this.D0;
            if (hVar == null) {
                Intrinsics.r("boardNavigator");
                throw null;
            }
            String j13 = pinnableImage.j();
            Intrinsics.checkNotNullExpressionValue(j13, "getPinnedToBoardUid(...)");
            g70.h.b(hVar, j13, new f(this, 4));
        }
    }

    public final void d8() {
        AdapterEmptyView adapterEmptyView = this.f104697f0;
        if (adapterEmptyView == null) {
            Intrinsics.r("emptyView");
            throw null;
        }
        adapterEmptyView.c(getString(x0.pin_marklet_no_images_error));
        AdapterEmptyView adapterEmptyView2 = this.f104697f0;
        if (adapterEmptyView2 != null) {
            adapterEmptyView2.b(ve0.b.TOP_LEFT);
        } else {
            Intrinsics.r("emptyView");
            throw null;
        }
    }

    public final boolean e8() {
        Feed a13;
        op.b bVar = this.f104694c0;
        if (bVar == null || this.f104710s0 || (a13 = bVar.a()) == null || a13.l() < 2) {
            return false;
        }
        this.f104705n0 = true;
        return true;
    }

    public final void f8(PinnableImageFeed imageFeed, int i13) {
        Intrinsics.checkNotNullParameter(imageFeed, "imageFeed");
        if (E4() != null) {
            this.f104703l0 = imageFeed;
            Z7();
            if (this.f104710s0) {
                j8();
                GestaltCheckBox gestaltCheckBox = this.f104701j0;
                if (gestaltCheckBox == null) {
                    Intrinsics.r("selectAllCheckBox");
                    throw null;
                }
                if (c0.d.a2(gestaltCheckBox)) {
                    a8(true);
                }
            }
            if (i13 == 0) {
                d8();
            }
        }
    }

    @Override // k11.e
    public final void g0(int i13) {
        i92.k kVar = this.C0;
        if (kVar != null) {
            kVar.i(getString(i13));
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // k11.e
    /* renamed from: g3 */
    public final String getF81427f1() {
        return null;
    }

    public final void g8(int i13, fm1.c cVar) {
        GestaltCheckBox gestaltCheckBox = this.f104701j0;
        if (gestaltCheckBox == null) {
            Intrinsics.r("selectAllCheckBox");
            throw null;
        }
        if (gestaltCheckBox.getId() == i13) {
            GestaltCheckBox gestaltCheckBox2 = this.f104701j0;
            if (gestaltCheckBox2 != null) {
                gestaltCheckBox2.L(new j(0, cVar));
            } else {
                Intrinsics.r("selectAllCheckBox");
                throw null;
            }
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getP0() {
        if (this.H0) {
            return a4.FLOATING_BOARD_PICKER;
        }
        return null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getK0() {
        return d4.PIN_CREATE_PINMARKLET;
    }

    @Override // k11.e
    public final void h4(String str, String boardName, String str2, String str3) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        FragmentActivity E4 = E4();
        if (E4 == null) {
            return;
        }
        b60.b bVar = this.f104717z0;
        if (bVar == null) {
            Intrinsics.r("myActiveUserManager");
            throw null;
        }
        if (!yb2.a.b(((b60.d) bVar).f())) {
            String string = boardName.length() == 0 ? getString(x0.pinned) : getString(f02.g.saved_onto_board, boardName);
            Intrinsics.f(string);
            Context context = getContext();
            if (context != null) {
                o.M(0, context, string);
            }
        }
        lu1.b bVar2 = this.f104714w0;
        if (bVar2 == null) {
            Intrinsics.r("baseActivityHelper");
            throw null;
        }
        ((lu1.c) bVar2).k(E4, false);
        E4.setResult(-1);
        E4.finish();
    }

    public final void h8() {
        if (this.f104710s0) {
            int size = this.f104711t0.size();
            if (size > 0) {
                GestaltText gestaltText = this.f104698g0;
                if (gestaltText != null) {
                    gestaltText.i(new j0(size, 4));
                    return;
                } else {
                    Intrinsics.r("headerVw");
                    throw null;
                }
            }
            GestaltText gestaltText2 = this.f104698g0;
            if (gestaltText2 != null) {
                gestaltText2.i(h.f104687n);
            } else {
                Intrinsics.r("headerVw");
                throw null;
            }
        }
    }

    public final void i8() {
        int i13 = 1;
        boolean z13 = !this.f104711t0.isEmpty();
        GestaltButton gestaltButton = this.f104702k0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        gestaltButton.d(new t(z13, i13));
        if (this.H0) {
            FloatingBoardPicker floatingBoardPicker = this.f104700i0;
            if (floatingBoardPicker != null) {
                floatingBoardPicker.i(z13);
            } else {
                Intrinsics.r("floatingBoardPicker");
                throw null;
            }
        }
    }

    @Override // k11.e
    public final boolean isBound() {
        return this.f91282J;
    }

    public final void j8() {
        View view = getView();
        Context context = getContext();
        if (view == null || context == null) {
            return;
        }
        PinnableImageFeed pinnableImageFeed = this.f104703l0;
        if (pinnableImageFeed != null) {
            HashSet hashSet = this.f104712u0;
            List q13 = pinnableImageFeed.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
            hashSet.addAll(q13);
            hashSet.removeAll(this.f104711t0);
        }
        ViewGroup viewGroup = this.f104699h0;
        if (viewGroup == null) {
            Intrinsics.r("bottomToolbar");
            throw null;
        }
        viewGroup.setVisibility(0);
        if (this.H0) {
            g8(yy1.c.pin_marklet_select_all_checkbox_top_right, fm1.c.VISIBLE);
            g8(yy1.c.pin_marklet_select_all_checkbox, fm1.c.GONE);
            if (a0.q0(context)) {
                ViewGroup viewGroup2 = this.f104699h0;
                if (viewGroup2 == null) {
                    Intrinsics.r("bottomToolbar");
                    throw null;
                }
                int i13 = eo1.b.color_themed_transparent;
                Object obj = d5.a.f53679a;
                viewGroup2.setBackgroundColor(context.getColor(i13));
            } else {
                ViewGroup viewGroup3 = this.f104699h0;
                if (viewGroup3 == null) {
                    Intrinsics.r("bottomToolbar");
                    throw null;
                }
                int i14 = yy1.b.bg_transparent_to_gradient;
                Object obj2 = d5.a.f53679a;
                viewGroup3.setBackground(context.getDrawable(i14));
            }
            FloatingBoardPicker floatingBoardPicker = this.f104700i0;
            if (floatingBoardPicker == null) {
                Intrinsics.r("floatingBoardPicker");
                throw null;
            }
            floatingBoardPicker.setOnClickListener(new e(this, 1));
        } else {
            g8(yy1.c.pin_marklet_select_all_checkbox, fm1.c.VISIBLE);
            g8(yy1.c.pin_marklet_select_all_checkbox_top_right, fm1.c.GONE);
            FloatingBoardPicker floatingBoardPicker2 = this.f104700i0;
            if (floatingBoardPicker2 == null) {
                Intrinsics.r("floatingBoardPicker");
                throw null;
            }
            floatingBoardPicker2.setVisibility(8);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ds1.a.iab_bottom_bar_height);
        PinterestGridView pinterestGridView = this.f104695d0;
        if (pinterestGridView != null) {
            pinterestGridView.Y0(0, dimensionPixelSize);
        }
        GestaltCheckBox gestaltCheckBox = this.f104701j0;
        if (gestaltCheckBox == null) {
            Intrinsics.r("selectAllCheckBox");
            throw null;
        }
        c0.d.l(gestaltCheckBox, new f(this, 5));
        h8();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList parcelableArrayList;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        d0 s73 = s7();
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        op.b bVar = new op.b(s73, this, bf.b.S(viewLifecycleOwner));
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("selected_pinnable_images")) != null && (!parcelableArrayList.isEmpty())) {
            LinkedHashSet linkedHashSet = this.f104711t0;
            linkedHashSet.addAll(linkedHashSet);
        }
        this.f104694c0 = bVar;
        this.E = yy1.d.fragment_pin_marklet;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        PinterestGridView pinterestGridView = (PinterestGridView) onCreateView.findViewById(yy1.c.grid_vw);
        op.b bVar2 = this.f104694c0;
        if (bVar2 != null) {
            pinterestGridView.P0(bVar2);
            if (bVar2.e(this.f104696e0) || bVar2.e(bundle)) {
                pinterestGridView.s1(p1.LOADED);
            }
        }
        pinterestGridView.T0(d4.PIN_CREATE_PINMARKLET);
        a4 p03 = getP0();
        if (p03 != null) {
            pinterestGridView.S0(p03);
        }
        this.f104695d0 = pinterestGridView;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        op.b bVar = this.f104694c0;
        this.f104696e0 = bVar != null ? bVar.f(this.f104696e0) : null;
        PinterestGridView pinterestGridView = this.f104695d0;
        if (pinterestGridView != null) {
            pinterestGridView.H0();
        }
        super.onDestroyView();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        PinnableImage pinnableImage;
        Intrinsics.checkNotNullParameter(view, "view");
        op.b bVar = this.f104694c0;
        if (bVar == null || (pinnableImage = (PinnableImage) bVar.getItem(i13)) == null) {
            return;
        }
        if (!this.f104710s0) {
            c8(pinnableImage);
            return;
        }
        LinkedHashSet linkedHashSet = this.f104711t0;
        boolean contains = linkedHashSet.contains(pinnableImage);
        HashSet hashSet = this.f104712u0;
        if (contains) {
            int i14 = yy1.e.accessibility_pinmarklet_image_toggle_deselected;
            View view2 = getView();
            if (view2 != null) {
                view2.announceForAccessibility(requireContext().getResources().getString(i14));
            }
            linkedHashSet.remove(pinnableImage);
            hashSet.add(pinnableImage);
            GestaltCheckBox gestaltCheckBox = this.f104701j0;
            if (gestaltCheckBox == null) {
                Intrinsics.r("selectAllCheckBox");
                throw null;
            }
            if (c0.d.a2(gestaltCheckBox)) {
                GestaltCheckBox gestaltCheckBox2 = this.f104701j0;
                if (gestaltCheckBox2 == null) {
                    Intrinsics.r("selectAllCheckBox");
                    throw null;
                }
                gestaltCheckBox2.L(h.f104683j);
            }
        } else {
            int i15 = yy1.e.accessibility_pinmarklet_image_toggle_selected;
            View view3 = getView();
            if (view3 != null) {
                view3.announceForAccessibility(requireContext().getResources().getString(i15));
            }
            linkedHashSet.add(pinnableImage);
            hashSet.remove(pinnableImage);
            if (hashSet.isEmpty()) {
                GestaltCheckBox gestaltCheckBox3 = this.f104701j0;
                if (gestaltCheckBox3 == null) {
                    Intrinsics.r("selectAllCheckBox");
                    throw null;
                }
                gestaltCheckBox3.L(h.f104684k);
            }
        }
        i8();
        bVar.notifyDataSetChanged();
        h8();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Q7(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("com.pinterest.EXTRA_URL", this.f104704m0);
        outState.putParcelableArrayList("selected_pinnable_images", new ArrayList<>(this.f104711t0));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        GestaltCheckBox gestaltCheckBox;
        Feed feed;
        Intrinsics.checkNotNullParameter(v13, "v");
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getString("com.pinterest.EXTRA_URL") : null) != null) {
            this.f104704m0 = arguments.getString("com.pinterest.EXTRA_URL");
            if (arguments.getParcelable("com.pinterest.EXTRA_FEED") != null) {
                this.f104703l0 = (PinnableImageFeed) arguments.getParcelable("com.pinterest.EXTRA_FEED");
            }
        } else {
            if ((bundle != null ? bundle.getString("com.pinterest.EXTRA_URL") : null) == null) {
                ((tb0.h) ob0.b.f93978b).q(new IllegalArgumentException(), "Plog:WTF", p.IDEA_PINS_CREATION);
                FragmentActivity E4 = E4();
                if (E4 != null) {
                    E4.finish();
                    return;
                }
                return;
            }
            this.f104704m0 = bundle.getString("com.pinterest.EXTRA_URL");
        }
        if (arguments != null) {
            if (arguments.getString("com.pinterest.EXTRA_META") != null) {
                this.f104706o0 = arguments.getString("com.pinterest.EXTRA_META");
            }
            if (arguments.getString("com.pinterest.CLOSEUP_PIN_ID") != null) {
                this.f104707p0 = arguments.getString("com.pinterest.CLOSEUP_PIN_ID");
            }
            if (arguments.getString("com.pinterest.EXTRA_BOARD_ID") != null) {
                this.f104708q0 = arguments.getString("com.pinterest.EXTRA_BOARD_ID");
            }
            if (arguments.getString("com.pinterest.EXTRA_BOARD_NAME") != null) {
                this.f104709r0 = arguments.getString("com.pinterest.EXTRA_BOARD_NAME");
            }
            if (arguments.getString("com.pinterest.EXTRA_SESSION_ID") != null) {
                this.F0 = arguments.getString("com.pinterest.EXTRA_SESSION_ID");
            }
            if (arguments.getString("create_type") != null) {
                String string = arguments.getString("create_type");
                this.I0 = string;
                this.H0 = Intrinsics.d(string, "share_extension_android");
            }
        }
        View findViewById = v13.findViewById(yy1.c.pin_marklet_next_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f104702k0 = (GestaltButton) findViewById;
        View findViewById2 = v13.findViewById(yy1.c.floating_board_picker);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f104700i0 = (FloatingBoardPicker) findViewById2;
        i8();
        GestaltButton gestaltButton = this.f104702k0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        String string2 = this.H0 ? getString(x0.save_pin) : getString(x0.next);
        Intrinsics.f(string2);
        int i13 = 0;
        gestaltButton.d(new i(bs1.c.h2(string2), i13));
        gestaltButton.e(new d(this, i13));
        View findViewById3 = v13.findViewById(yy1.c.pin_marklet_header_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f104698g0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(yy1.c.pin_marklet_bottom_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f104699h0 = (ViewGroup) findViewById4;
        if (this.H0) {
            View findViewById5 = v13.findViewById(yy1.c.pin_marklet_select_all_checkbox_top_right);
            Intrinsics.f(findViewById5);
            gestaltCheckBox = (GestaltCheckBox) findViewById5;
        } else {
            View findViewById6 = v13.findViewById(yy1.c.pin_marklet_select_all_checkbox);
            Intrinsics.f(findViewById6);
            gestaltCheckBox = (GestaltCheckBox) findViewById6;
        }
        this.f104701j0 = gestaltCheckBox;
        View findViewById7 = v13.findViewById(yy1.c.header);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new e(this, i13));
        }
        View findViewById8 = v13.findViewById(wy1.d.empty_vw);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f104697f0 = (AdapterEmptyView) findViewById8;
        b60.b bVar = this.f104717z0;
        if (bVar == null) {
            Intrinsics.r("myActiveUserManager");
            throw null;
        }
        wy0 f13 = ((b60.d) bVar).f();
        if (f13 != null) {
            this.G0 = f13.getUid();
        }
        int i14 = 1;
        if (this.H0) {
            y yVar = this.A0;
            if (yVar == null) {
                Intrinsics.r("boardFeedRepository");
                throw null;
            }
            String str = this.G0;
            if (str == null) {
                str = "";
            }
            l1 A = m22.a.e(yVar, str, true).H(tk2.e.f118017c).A(wj2.c.a());
            g gVar = new g(this, i13);
            A.d(gVar);
            Intrinsics.checkNotNullExpressionValue(gVar, "subscribeWith(...)");
            R6(gVar);
        }
        if (this.f91282J) {
            K7();
        }
        op.b bVar2 = this.f104694c0;
        if (bVar2 == null || (feed = bVar2.a()) == null || feed.l() <= 0) {
            Z7();
        } else {
            feed.B();
            Intrinsics.checkNotNullParameter(feed, "feed");
            op.b bVar3 = this.f104694c0;
            if (bVar3 != null) {
                bVar3.d();
                bVar3.g(feed);
                PinterestGridView pinterestGridView = this.f104695d0;
                if (pinterestGridView != null) {
                    pinterestGridView.requestLayout();
                }
                PinterestGridView pinterestGridView2 = this.f104695d0;
                if (pinterestGridView2 != null) {
                    pinterestGridView2.d();
                }
            }
            PinterestGridView pinterestGridView3 = this.f104695d0;
            if (pinterestGridView3 != null) {
                pinterestGridView3.s1(p1.LOADED);
            }
        }
        if (this.f104710s0) {
            j8();
        }
        PinterestGridView pinterestGridView4 = this.f104695d0;
        if (pinterestGridView4 != null) {
            pinterestGridView4.p1(this);
        }
        PinterestGridView pinterestGridView5 = this.f104695d0;
        if (pinterestGridView5 != null) {
            pinterestGridView5.r1(this);
        }
        PinterestGridView pinterestGridView6 = this.f104695d0;
        if (pinterestGridView6 != null) {
            pinterestGridView6.setBackgroundColor(-1);
        }
        View findViewById9 = v13.findViewById(yy1.c.pin_marklet_dismiss_bt);
        Intrinsics.g(findViewById9, "null cannot be cast to non-null type com.pinterest.gestalt.iconbutton.GestaltIconButton");
        ((GestaltIconButton) findViewById9).u(new d(this, i14));
    }

    @Override // nl1.d
    public final List r7() {
        PinterestAdapterView K0;
        PinterestGridView pinterestGridView = this.f104695d0;
        if (pinterestGridView == null || (K0 = pinterestGridView.K0()) == null) {
            return null;
        }
        return K0.d();
    }

    @Override // k11.e
    public final String s2() {
        return null;
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap hashMap = new HashMap();
        String str = this.F0;
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        String str2 = this.I0;
        if (str2 != null) {
            hashMap.put("method", str2);
        }
        a4 p03 = getP0();
        hashMap.put("board_picker_surface_origin", String.valueOf(p03 != null ? Integer.valueOf(p03.value()) : null));
        return hashMap;
    }

    @Override // k11.e
    public final void w3(String str) {
        i92.k kVar = this.C0;
        if (kVar != null) {
            kVar.i(str);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // k11.e
    public final String z1() {
        Bundle extras;
        FragmentActivity E4 = E4();
        if (E4 == null || (extras = E4.getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("com.pinterest.EXTRA_PIN_CREATE_TYPE");
    }
}
