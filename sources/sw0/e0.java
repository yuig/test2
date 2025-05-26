package sw0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.feature.mediagallery.screen.MediaGalleryLocation;
import com.pinterest.feature.video.view.IdeaPinVideoExportLoadingView;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.p2;
import h32.d4;
import h32.f1;
import h32.u0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.e2;
import lh0.z3;
import m60.t0;
import m60.x0;
import so.oa;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115431i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f115432j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(j0 j0Var, int i13) {
        super(1);
        this.f115431i = i13;
        this.f115432j = j0Var;
    }

    public final void b(Throwable th3) {
        int i13 = this.f115431i;
        j0 j0Var = this.f115432j;
        switch (i13) {
            case 1:
                s92.o oVar = s92.o.ERROR;
                new oy.p(oVar, th3.toString()).i();
                new oy.b0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, oVar, th3.toString(), 2).i();
                j0Var.r9(true);
                j0Var.f115491v1.i(j0Var.getResources().getString(x0.try_again));
                j0Var.b6().q(th3, "MediaGalleryFragment: generate adjusted media for publishing", tb0.p.MEDIA_GALLERY);
                break;
            case 2:
                j0Var.b6().q(th3, "MediaGalleryFragment: failed to update repository with new pages", tb0.p.MEDIA_GALLERY);
                break;
            case 3:
            case 5:
            default:
                Intrinsics.f(th3);
                j0Var.displayError(th3);
                break;
            case 4:
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(j0Var.getString(x0.generic_error));
                break;
            case 6:
                j0Var.b6().q(th3, "MediaGalleryFragment: failed to update repository with new pages", tb0.p.MEDIA_GALLERY);
                break;
            case 7:
                j0Var.b6().q(th3, "MediaGalleryFragment: failed to update repository with new clips", tb0.p.MEDIA_GALLERY);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pw0.d0 d0Var;
        int i13;
        int i14;
        boolean t33;
        int i15;
        int i16;
        int i17 = this.f115431i;
        j0 j0Var = this.f115432j;
        int i18 = 1;
        Unit unit = null;
        switch (i17) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int id3 = it.getId();
                if (id3 == ct1.b.media_gallery_drafts_button) {
                    int i19 = j0.H1;
                    j0Var.getClass();
                    j0Var.M1(j0.V8(j0Var, p2.a(), ml1.b.VERTICAL_TRANSITION.getValue(), 4));
                } else if (id3 == ct1.b.media_gallery_camera_button) {
                    int i23 = j0.H1;
                    j0Var.getClass();
                    NavigationImpl V8 = j0.V8(j0Var, p2.c(), ml1.b.VERTICAL_TRANSITION.getValue(), 4);
                    V8.d0(j0Var.e9(), "com.pinterest.EXTRA_LOCAL_STORY_PIN_PAGE_DURATION");
                    j0Var.M1(V8);
                } else if (id3 == t0.idea_pin_help) {
                    nx.f0 f0Var = j0Var.G0;
                    if (f0Var == null) {
                        Intrinsics.r("pinalyticsFactory");
                        throw null;
                    }
                    j0Var.f7().d(new jc0.v(new rv0.a(j0Var, f0Var), false, 0L, 30));
                    j0Var.s7().X(u0.STORY_PIN_QUESTION_BUTTON);
                } else if (id3 == ct1.b.gallery_title) {
                    if (j0Var.n9()) {
                        j0Var.s7().U(new h32.i0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, null, null, null, u0.STORY_PIN_PHOTO_PICKER_ALBUM), f1.DROPDOWN_CHANGE, null, null, null, false);
                        ((ag1.b) j0Var.d9().get()).f15137j = j0Var.f115492w1;
                        NavigationImpl w13 = Navigation.w1(MediaGalleryLocation.MEDIA_GALLERY_DIRECTORY);
                        w13.Y1("com.pinterest.EXTRA_IS_STORY_PIN", j0Var.o9());
                        j0Var.M1(w13);
                    } else {
                        wk2.a aVar = j0Var.f115495z0;
                        if (aVar == null) {
                            Intrinsics.r("mediaDirectoryFragmentProvider");
                            throw null;
                        }
                        n nVar = (n) aVar.get();
                        pw0.w listener = j0Var.f115492w1;
                        if (listener != null) {
                            nVar.getClass();
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            nVar.B0 = listener;
                        }
                        w0 supportFragmentManager = j0Var.requireActivity().getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        int i24 = ct1.b.fragment_wrapper;
                        Intrinsics.f(nVar);
                        mo1.c.c(supportFragmentManager, i24, nVar, true, mo1.a.MODAL, 32);
                    }
                } else if (id3 == ct1.b.media_gallery_save_from_url_button) {
                    int i25 = j0.H1;
                    e2 e2Var = j0Var.E0;
                    if (e2Var == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    z3 z3Var = a4.f83297a;
                    if (!e2Var.a("disable_all", z3Var)) {
                        e2 e2Var2 = j0Var.E0;
                        if (e2Var2 == null) {
                            Intrinsics.r("experiments");
                            throw null;
                        }
                        if (!e2Var2.a("disable_web_pins", z3Var)) {
                            j0Var.s7().X(u0.WEBSITE_BUTTON);
                            j0Var.s7().F(h32.g0.MODAL_DIALOG, u0.FIND_IMAGES_BUTTON);
                            j0Var.f7().d(new jc0.v(new lp.k(j0Var), false, 0L, 30));
                        }
                    }
                    FragmentActivity requireActivity = j0Var.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    Context requireContext = j0Var.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    g3.v2(requireActivity, requireContext);
                } else if (id3 == ct1.b.gallery_next_gestalt_button && (d0Var = j0Var.f115493x1) != null) {
                    qw0.j jVar = (qw0.j) d0Var;
                    if (jVar.F3()) {
                        int[] iArr = qw0.d.f105272a;
                        pw0.x xVar = jVar.f105279a;
                        int i26 = iArr[xVar.ordinal()];
                        ArrayList arrayList = jVar.f105294p;
                        ag1.i iVar = i26 != 3 ? i26 != 4 ? null : ag1.i.MULTI_ASSET : arrayList.size() > 1 ? ag1.i.MULTI_ASSET : d7.b.F(arrayList) instanceof d30 ? ag1.i.IMAGE : ag1.i.VIDEO;
                        nx.d0 pinalytics = jVar.getPinalytics();
                        u0 u0Var = u0.NEXT_BUTTON;
                        HashMap hashMap = new HashMap();
                        boolean z13 = arrayList instanceof Collection;
                        if (z13 && arrayList.isEmpty()) {
                            i13 = 0;
                        } else {
                            Iterator it2 = arrayList.iterator();
                            i13 = 0;
                            while (it2.hasNext()) {
                                if ((((pu) it2.next()) instanceof d30) && (i13 = i13 + 1) < 0) {
                                    kotlin.collections.f0.o();
                                    throw null;
                                }
                            }
                        }
                        hashMap.put("story_pin_image_count", String.valueOf(i13));
                        if (z13 && arrayList.isEmpty()) {
                            i14 = 0;
                        } else {
                            Iterator it3 = arrayList.iterator();
                            i14 = 0;
                            while (it3.hasNext()) {
                                if ((((pu) it3.next()) instanceof k01) && (i14 = i14 + 1) < 0) {
                                    kotlin.collections.f0.o();
                                    throw null;
                                }
                            }
                        }
                        hashMap.put("story_pin_video_count", String.valueOf(i14));
                        if (iVar != null) {
                            hashMap.put("idea_pin_media_type", iVar.getValue());
                        }
                        Unit unit2 = Unit.f80348a;
                        pinalytics.Z(u0Var, hashMap);
                        boolean z14 = xVar == pw0.x.IdeaPinAddMediaClip;
                        boolean z15 = arrayList.size() == 1 && (arrayList.get(0) instanceof d30);
                        if (((Boolean) jVar.f105300v.getValue()).booleanValue() || !z15 || z14) {
                            t33 = jVar.t3();
                        } else {
                            lg1.h hVar = jVar.f105299u;
                            if (hVar != null) {
                                hVar.a();
                            }
                            t33 = true;
                        }
                        if (z13 && arrayList.isEmpty()) {
                            i15 = 0;
                        } else {
                            Iterator it4 = arrayList.iterator();
                            i15 = 0;
                            while (it4.hasNext()) {
                                if ((((pu) it4.next()) instanceof d30) && (i15 = i15 + 1) < 0) {
                                    kotlin.collections.f0.o();
                                    throw null;
                                }
                            }
                        }
                        if (z13 && arrayList.isEmpty()) {
                            i16 = 0;
                        } else {
                            Iterator it5 = arrayList.iterator();
                            i16 = 0;
                            while (it5.hasNext()) {
                                if ((((pu) it5.next()) instanceof k01) && (i16 = i16 + 1) < 0) {
                                    kotlin.collections.f0.o();
                                    throw null;
                                }
                            }
                        }
                        new oy.c0(i15, i16, t33).i();
                        if (t33) {
                            jVar.B3();
                        } else {
                            if (jVar.isBound()) {
                                IdeaPinVideoExportLoadingView ideaPinVideoExportLoadingView = ((j0) ((pw0.e0) jVar.getView())).f115471b1;
                                if (ideaPinVideoExportLoadingView == null) {
                                    Intrinsics.r("videoExportLoadingView");
                                    throw null;
                                }
                                bs1.c.R1(ideaPinVideoExportLoadingView, true);
                            }
                            qw0.c cVar = jVar.f105303y;
                            if (cVar != null) {
                                new oy.b0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, s92.o.ABORTED, null, 10).i();
                                cVar.f105270e = false;
                            }
                            qw0.c cVar2 = new qw0.c(jVar);
                            jVar.f105303y = cVar2;
                            cVar2.b();
                        }
                    } else {
                        jVar.B3();
                    }
                }
                return Unit.f80348a;
            case 1:
                b((Throwable) obj);
                return Unit.f80348a;
            case 2:
                b((Throwable) obj);
                return Unit.f80348a;
            case 3:
                File file = (File) obj;
                if (file != null) {
                    FragmentActivity requireActivity2 = j0Var.requireActivity();
                    Intent intent = new Intent();
                    intent.putExtra("com.pinterest.EXTRA_PHOTO_PATH", file.getPath());
                    Unit unit3 = Unit.f80348a;
                    requireActivity2.setResult(910, intent);
                    requireActivity2.finish();
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(j0Var.getString(x0.generic_error));
                }
                return Unit.f80348a;
            case 4:
                b((Throwable) obj);
                return Unit.f80348a;
            case 5:
                FullBleedGestaltSpinner fullBleedGestaltSpinner = j0Var.f115470a1;
                if (fullBleedGestaltSpinner != null) {
                    fullBleedGestaltSpinner.showLoadingSpinner(true);
                    return Unit.f80348a;
                }
                Intrinsics.r("progressIndicator");
                throw null;
            case 6:
                b((Throwable) obj);
                return Unit.f80348a;
            case 7:
                b((Throwable) obj);
                return Unit.f80348a;
            case 8:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                int i27 = j0.H1;
                j0Var.u9(navigation);
                return Unit.f80348a;
            case 9:
                b((Throwable) obj);
                return Unit.f80348a;
            default:
                int intValue = ((Number) obj).intValue();
                j0Var.x2();
                if (intValue == 0) {
                    j0Var.f9();
                    FragmentActivity requireActivity3 = j0Var.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                    ny1.w.b(requireActivity3);
                } else if (intValue == 1) {
                    ny1.w f93 = j0Var.f9();
                    FragmentActivity requireActivity4 = j0Var.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                    ny1.w.e(f93, requireActivity4, ny1.f.f92666f, tb0.p.MEDIA_GALLERY.toString(), new f0(j0Var, i18), new f0(j0Var, 2), 72);
                }
                return Unit.f80348a;
        }
    }
}
