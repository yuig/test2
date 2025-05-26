package ru0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.feature.ideaPinCreation.closeup.view.a2;
import com.pinterest.feature.ideaPinCreation.closeup.view.c1;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import com.pinterest.ui.imageview.WebImageView;
import is1.v;
import j1.p0;
import java.util.Iterator;
import kh2.c3;
import kh2.g3;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import pu0.t;
import su0.o;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109992i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f109993j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f109994k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, t tVar, int i13) {
        super(1);
        this.f109992i = i13;
        this.f109993j = jVar;
        this.f109994k = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i13 = this.f109992i;
        t tVar = this.f109994k;
        j jVar = this.f109993j;
        switch (i13) {
            case 0:
                pu0.s newState = (pu0.s) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                jVar.f110003h = newState;
                if (newState != null) {
                    ((o) tVar).b8(newState);
                    return Unit.f80348a;
                }
                Intrinsics.r(AnimatedTarget.PROPERTY_STATE);
                throw null;
            default:
                ln0 ln0Var = (ln0) obj;
                Intrinsics.f(ln0Var);
                jVar.f110004i = ln0Var;
                tp y13 = ln0Var.y();
                jVar.f110005j = y13;
                Iterator it = y13.getOverlayBlocks().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.d(((qq) obj2).getConfig().getId(), jVar.f109996a)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                qq qqVar = (qq) obj2;
                if (qqVar != null) {
                    vn0 mediaList = y13.getMediaList();
                    h hVar = new h(jVar, tVar, 0);
                    long startTimeMs = qqVar.getDurationConfig().getStartTimeMs();
                    int startMediaIndex = mediaList.getStartMediaIndex();
                    long startTimeMs2 = mediaList.getStartTimeMs();
                    int startMediaIndex2 = mediaList.getStartMediaIndex();
                    int endMediaIndex = mediaList.getEndMediaIndex();
                    if (startMediaIndex2 <= endMediaIndex) {
                        long j13 = 0;
                        while (true) {
                            bo0 bo0Var = (bo0) mediaList.getItems().get(startMediaIndex2);
                            long endTimeMs = (startMediaIndex2 == mediaList.getEndMediaIndex() ? mediaList.getEndTimeMs() + bo0Var.getStartTimeMs() : bo0Var.getEndTimeMs()) - (startMediaIndex2 == mediaList.getStartMediaIndex() ? mediaList.getStartTimeMs() + bo0Var.getStartTimeMs() : bo0Var.getStartTimeMs());
                            if (j13 > startTimeMs || startTimeMs >= j13 + endTimeMs) {
                                j13 += endTimeMs;
                                if (startMediaIndex2 != endMediaIndex) {
                                    startMediaIndex2++;
                                }
                            } else {
                                startTimeMs2 = startTimeMs - j13;
                                startMediaIndex = startMediaIndex2;
                            }
                        }
                    }
                    bo0 mediaItem = (bo0) mediaList.getItems().get(startMediaIndex);
                    Context context = jVar.f109998c;
                    Intrinsics.checkNotNullParameter(context, "context");
                    ag1.b cache = jVar.f109999d;
                    Intrinsics.checkNotNullParameter(cache, "cache");
                    Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
                    Bitmap D = c3.D(context, cache, mediaItem, startTimeMs2);
                    p0 p0Var = new p0(hVar, jVar, qqVar, D != null ? k3.B(context, D, 0.3f, 25.0f) : null, 25);
                    RectF rectF = new RectF(0.0f, 0.0f, bs1.c.V(context, aq1.b.overlay_block_selection_container_width), bs1.c.V(context, aq1.b.overlay_block_selection_container_height));
                    if (qqVar instanceof nq) {
                        WebImageView webImageView = new WebImageView(context);
                        webImageView.f52564p = new oq.h(2, webImageView, p0Var);
                        webImageView.loadUrl(((nq) qqVar).getStickerDetails().q());
                    } else if (qqVar instanceof oq) {
                        p0Var.invoke(new c1(context, (oq) j.s3((oq) qqVar), rectF.width(), rectF.height()).a());
                    } else {
                        boolean z13 = qqVar instanceof lq;
                        v vVar = v.f73649j;
                        if (z13) {
                            nl.b.o(jVar.f110002g.M(((lq) qqVar).getUserId()), new g(qqVar, p0Var, jVar, rectF), vVar);
                        } else if (qqVar instanceof pq) {
                            j.r3(qqVar, p0Var, jVar, rectF, a2.VTO_MAKEUP_PRODUCT_TAG, bs1.c.d2(context, x0.try_on_product_tag_cta));
                        } else if (qqVar instanceof jq) {
                            j.q3(qqVar, jVar, rectF, p0Var, ((jq) qqVar).getBoard());
                        } else if (qqVar instanceof kq) {
                            Bitmap Y = g3.Y(((kq) qqVar).getPhotoItem().e(), false);
                            if (Y != null) {
                                p0Var.invoke(Y);
                            }
                        } else if (qqVar instanceof mq) {
                            nl.b.o(jVar.f110001f.M(((mq) qqVar).getPinId()), new g(qqVar, jVar, rectF, p0Var), vVar);
                        }
                    }
                }
                return Unit.f80348a;
        }
    }
}
