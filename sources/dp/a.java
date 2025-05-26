package dp;

import ac2.o1;
import ac2.v;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.R;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.util.SparseIntArray;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import ap0.i;
import bc2.q;
import cb2.a0;
import com.pinterest.activity.conversation.view.ContactListInboxContainer;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.pin.view.PinCloseUpWebImageView;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.ads.feature.waista.view.GenAiDisclosureSkeletonLoadingView;
import com.pinterest.api.model.f30;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.feature.board.collab.service.BoardActionService;
import com.pinterest.feature.camera2.view.BasePhotoCameraView;
import com.pinterest.feature.comment.reactions.view.CommentReactionsContextMenuView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.view.e;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinColorEyeDropperView;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import com.pinterest.feature.pin.reactions.view.ReactionsContextMenuView;
import com.pinterest.feature.pincarouselads.view.l;
import com.pinterest.gestalt.text.GestaltText;
import eq0.j;
import fp0.d;
import h32.f1;
import h32.u0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.g3;
import kl0.z;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import m60.w;
import mq.u;
import mv0.r;
import nx.d0;
import nx.d1;
import pg0.k0;
import pg0.l0;
import rg0.n;
import rw0.f;
import sq0.e0;
import sq0.m;
import tb0.h;
import tb0.p;
import tt0.k;
import ua.m0;
import x02.i2;
import x02.p1;
import yq0.x;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56027c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f56025a = i13;
        this.f56026b = obj;
        this.f56027c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CommentReactionsContextMenuView commentReactionsContextMenuView;
        CommentReactionsContextMenuView commentReactionsContextMenuView2;
        View findViewById;
        ReactionsContextMenuView reactionsContextMenuView;
        int i13 = this.f56025a;
        Object obj = this.f56027c;
        Object obj2 = this.f56026b;
        switch (i13) {
            case 0:
                ((c) ((b) obj2).f56030e).a("", (List) obj, null);
                return;
            case 1:
                ContactListInboxContainer this$0 = (ContactListInboxContainer) obj2;
                Throwable th3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h hVar = this$0.f34866d;
                if (hVar != null) {
                    hVar.q(th3, "SendShareService Fail: useCachedShareContactSuggestions", p.SHARING);
                    return;
                } else {
                    Intrinsics.r("crashReporting");
                    throw null;
                }
            case 2:
                NUXActivity.logNuxStart$lambda$17((n) obj2, (NUXActivity) obj);
                return;
            case 3:
                View background = (View) obj;
                Intrinsics.checkNotNullParameter(background, "$background");
                ((ViewGroup) obj2).removeView(background);
                return;
            case 4:
                l overlay = (l) obj;
                Intrinsics.checkNotNullParameter(overlay, "$overlay");
                ((ViewGroup) obj2).removeView(overlay);
                return;
            case 5:
                StringBuilder screenshotDirectory = (StringBuilder) obj2;
                u this$02 = (u) obj;
                int i14 = u.P0;
                Intrinsics.checkNotNullParameter(screenshotDirectory, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                se2.a aVar = this$02.f88036x0;
                if (aVar != null) {
                    screenshotDirectory.append(((f) ((bf2.b) aVar).get()).g());
                    return;
                } else {
                    Intrinsics.r("mediaGalleryUtils");
                    throw null;
                }
            case 6:
                PinCloseUpWebImageView this$03 = (PinCloseUpWebImageView) obj2;
                String finalHtml = (String) obj;
                int i15 = PinCloseUpWebImageView.f34982d;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(finalHtml, "$finalHtml");
                this$03.loadData(finalHtml, "text/html", "utf-8");
                return;
            case 7:
                MainActivity this$04 = (MainActivity) obj2;
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(null, "$event");
                if (this$04.f35203u != null) {
                    throw null;
                }
                return;
            case 8:
                MainActivity this$05 = (MainActivity) obj2;
                k0 event = (k0) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(event, "$event");
                ConstraintLayout constraintLayout = (ConstraintLayout) this$05.findViewById(event.f100076b);
                if (constraintLayout == null || (commentReactionsContextMenuView = this$05.f35201t) == null) {
                    return;
                }
                se2.a aVar2 = this$05.M;
                if (aVar2 == null) {
                    Intrinsics.r("aggregatedCommentRepository");
                    throw null;
                }
                Object obj3 = ((bf2.b) aVar2).get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                x02.u uVar = (x02.u) obj3;
                se2.a aVar3 = this$05.N;
                if (aVar3 == null) {
                    Intrinsics.r("didItRepository");
                    throw null;
                }
                Object obj4 = ((bf2.b) aVar3).get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                commentReactionsContextMenuView.c(event.f100075a, new op0.c(uVar, (p1) obj4), constraintLayout, event.f100077c);
                return;
            case 9:
                MainActivity this$06 = (MainActivity) obj2;
                l0 event2 = (l0) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(event2, "$event");
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$06.findViewById(event2.f100079b);
                if (constraintLayout2 == null || (commentReactionsContextMenuView2 = this$06.f35201t) == null) {
                    return;
                }
                se2.a aVar4 = this$06.M;
                if (aVar4 == null) {
                    Intrinsics.r("aggregatedCommentRepository");
                    throw null;
                }
                Object obj5 = ((bf2.b) aVar4).get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                x02.u uVar2 = (x02.u) obj5;
                se2.a aVar5 = this$06.N;
                if (aVar5 == null) {
                    Intrinsics.r("didItRepository");
                    throw null;
                }
                Object obj6 = ((bf2.b) aVar5).get();
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                commentReactionsContextMenuView2.d(event2.f100078a, new op0.c(uVar2, (p1) obj6), constraintLayout2, event2.f100080c);
                return;
            case 10:
                MainActivity this$07 = (MainActivity) obj2;
                a0 event3 = (a0) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(event3, "$event");
                findViewById = this$07.findViewById(event3.f27288b);
                if (findViewById == null || (reactionsContextMenuView = this$07.f35199s) == null) {
                    return;
                }
                se2.a aVar6 = this$07.L;
                if (aVar6 == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                Object obj7 = ((bf2.b) aVar6).get();
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                i2 i2Var = (i2) obj7;
                d0 pinalytics = this$07.getPinalytics();
                se2.a aVar7 = this$07.Z;
                if (aVar7 == null) {
                    Intrinsics.r("trackingParamAttacher");
                    throw null;
                }
                Object obj8 = ((bf2.b) aVar7).get();
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                reactionsContextMenuView.d(event3.f27287a, new a21.c(i2Var, pinalytics, (d1) obj8, this$07.getEventManager(), false), findViewById, event3.f27289c, event3.f27290d);
                return;
            case 11:
                SbaAdsLeadGenExpandView this$08 = (SbaAdsLeadGenExpandView) obj2;
                View viewToScroll = (View) obj;
                int i16 = SbaAdsLeadGenExpandView.f35271w;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(viewToScroll, "$viewToScroll");
                this$08.f35272a.smoothScrollTo(0, viewToScroll.getTop());
                return;
            case 12:
                f30.a aVar8 = (f30.a) obj2;
                ev.h this$09 = (ev.h) obj;
                int i17 = ev.h.B0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                if (aVar8 == null) {
                    GenAiDisclosureSkeletonLoadingView genAiDisclosureSkeletonLoadingView = this$09.f60217s0;
                    if (genAiDisclosureSkeletonLoadingView != null) {
                        genAiDisclosureSkeletonLoadingView.a();
                        return;
                    }
                    return;
                }
                long integer = this$09.getResources().getInteger(R.integer.config_shortAnimTime);
                GenAiDisclosureSkeletonLoadingView genAiDisclosureSkeletonLoadingView2 = this$09.f60217s0;
                if (genAiDisclosureSkeletonLoadingView2 != null) {
                    genAiDisclosureSkeletonLoadingView2.b(integer);
                }
                GestaltText gestaltText = this$09.f60216r0;
                if (gestaltText == null) {
                    Intrinsics.r("genAiDisclosureDescription");
                    throw null;
                }
                gestaltText.setAlpha(0.0f);
                this$09.b8(aVar8);
                gestaltText.animate().alpha(1.0f).setDuration(integer).setListener(null);
                return;
            case 13:
                BoardActionService context = (BoardActionService) obj2;
                String text = (String) obj;
                int i18 = BoardActionService.f45114b;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(text, "$toast");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                Toast.makeText(context, text, 1).show();
                return;
            case 14:
                j0 screenshotDirectory2 = (j0) obj2;
                z this$010 = (z) obj;
                int i19 = z.f80128e2;
                Intrinsics.checkNotNullParameter(screenshotDirectory2, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                f fVar = this$010.f80136e1;
                if (fVar != null) {
                    screenshotDirectory2.f80434a = fVar.g();
                    return;
                } else {
                    Intrinsics.r("mediaGalleryUtils");
                    throw null;
                }
            case 15:
                i this$011 = (i) obj2;
                int i23 = i.f20310r0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                this$011.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                ((ViewPager) obj).A(this$011.f20317p0 + 1);
                return;
            case 16:
                BasePhotoCameraView this$012 = (BasePhotoCameraView) obj2;
                SparseIntArray sparseIntArray = BasePhotoCameraView.F;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Image acquireNextImage = ((ImageReader) obj).acquireNextImage();
                Intrinsics.checkNotNullExpressionValue(acquireNextImage, "acquireNextImage(...)");
                this$012.z(acquireNextImage, fa2.c.h());
                return;
            case 17:
                View this_enlargeTapTarget = (View) obj2;
                View parentView = (View) obj;
                Intrinsics.checkNotNullParameter(this_enlargeTapTarget, "$this_enlargeTapTarget");
                Intrinsics.checkNotNullParameter(parentView, "$parentView");
                Rect rect = new Rect();
                this_enlargeTapTarget.getHitRect(rect);
                int W = bs1.c.W(this_enlargeTapTarget, cb0.a.pin_reaction_tap_enlarge_dimension);
                rect.top -= W;
                rect.left -= W;
                rect.right += W;
                rect.bottom += W;
                parentView.setTouchDelegate(new TouchDelegate(rect, this_enlargeTapTarget));
                return;
            case 18:
                w eventManager = (w) obj2;
                LinkedHashMap linkedHashMap = eq0.c.f59915a;
                Intrinsics.checkNotNullParameter(eventManager, "$eventManager");
                eventManager.d(new j((f30) obj));
                return;
            case 19:
                m this$013 = (m) obj2;
                q videoTracks = (q) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(videoTracks, "$videoTracks");
                v vVar = ac2.w.f2066a;
                boolean k13 = ((h7.w) ac2.w.b(this$013.f115008c)).k(videoTracks.f22673b.f22665b, 0L);
                HashMap f13 = ((o1) this$013.f115011f).f2000c.f();
                if (f13 != null) {
                    return;
                }
                return;
            case 20:
                x this$014 = (x) obj2;
                e0 dataSource = (e0) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(dataSource, "$dataSource");
                Integer num = (Integer) this$014.f139752b.get(dataSource);
                int intValue = num != null ? num.intValue() : 0;
                int a13 = dataSource.a();
                LinkedHashMap linkedHashMap2 = this$014.f139753c;
                Integer num2 = (Integer) linkedHashMap2.get(dataSource);
                int intValue2 = intValue + (num2 != null ? num2.intValue() : 0);
                if (intValue2 != a13) {
                    StringBuilder v13 = a.a.v("Adapter notified but datasource ", x.b(dataSource), " does not have the correct size. Expected:", intValue2, " actual:");
                    v13.append(a13);
                    this$014.l(v13.toString());
                }
                linkedHashMap2.put(dataSource, 0);
                this$014.f139752b.put(dataSource, Integer.valueOf(a13));
                this$014.i();
                return;
            case 21:
                com.pinterest.feature.home.view.l this$015 = (com.pinterest.feature.home.view.l) obj2;
                List value = (List) obj;
                int i24 = com.pinterest.feature.home.view.l.f45873i;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(value, "$pins");
                e eVar = this$015.f45880g;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                eVar.f45852g = CollectionsKt.y0(value, eVar.f45854i);
                eVar.f45853h = -1;
                this$015.f45880g.h();
                return;
            case 22:
                k this$016 = (k) obj2;
                String cameraId = (String) obj;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(cameraId, "$cameraId");
                this$016.i(cameraId, this$016.f119163z);
                return;
            case 23:
                View this_apply = (View) obj2;
                tt0.l0 this$017 = (tt0.l0) obj;
                int i25 = tt0.l0.Z0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this_apply.clearAnimation();
                this_apply.animate().alpha(0.0f).setDuration(300L).setListener(new m0(this_apply, this$017, 9)).start();
                return;
            case 24:
                File file = (File) obj2;
                tt0.l0 this$018 = (tt0.l0) obj;
                int i26 = tt0.l0.Z0;
                Intrinsics.checkNotNullParameter(file, "$file");
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                d dVar = this$018.f119189y0;
                if (dVar == null) {
                    Intrinsics.r("cameraView");
                    throw null;
                }
                Bitmap Y = g3.Y(absolutePath, dVar.k());
                ImageView imageView = this$018.f119187w0;
                if (imageView == null) {
                    Intrinsics.r("photoPreview");
                    throw null;
                }
                imageView.setVisibility(0);
                ImageView imageView2 = this$018.f119187w0;
                if (imageView2 == null) {
                    Intrinsics.r("photoPreview");
                    throw null;
                }
                imageView2.setImageBitmap(Y);
                if (this$018.g8().m1()) {
                    FullBleedGestaltSpinner fullBleedGestaltSpinner = this$018.F0;
                    if (fullBleedGestaltSpinner != null) {
                        fullBleedGestaltSpinner.showLoadingSpinner(true);
                        return;
                    } else {
                        Intrinsics.r("progressIndicator");
                        throw null;
                    }
                }
                return;
            case 25:
                IdeaPinColorEyeDropperView this$019 = (IdeaPinColorEyeDropperView) obj2;
                String str = (String) obj;
                int i27 = IdeaPinColorEyeDropperView.f45980i;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                cu0.c cVar = this$019.f45983c;
                if (cVar != null) {
                    ((f0) cVar).z0(str);
                }
                this$019.f45987g = null;
                return;
            case 26:
                f0 this$020 = (f0) obj2;
                String tagId = (String) obj;
                int i28 = f0.f46147l0;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(tagId, "$tagId");
                if (this$020.I0(tagId)) {
                    return;
                }
                this$020.postDelayed(new a(26, this$020, tagId), 100L);
                return;
            case 27:
                r this$021 = (r) obj2;
                ArrayList filters = (ArrayList) obj;
                int i29 = r.f88395t1;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(filters, "$filters");
                this$021.f88405q1.F(filters);
                return;
            case 28:
                j0 screenshotDirectory3 = (j0) obj2;
                iz0.n this$022 = (iz0.n) obj;
                int i33 = iz0.n.Y0;
                Intrinsics.checkNotNullParameter(screenshotDirectory3, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                screenshotDirectory3.f80434a = this$022.N0.g();
                return;
            default:
                j0 screenshotDirectory4 = (j0) obj2;
                b01.l this$023 = (b01.l) obj;
                int i34 = b01.l.f20744r1;
                Intrinsics.checkNotNullParameter(screenshotDirectory4, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                screenshotDirectory4.f80434a = this$023.f20760p1.g();
                return;
        }
    }
}
