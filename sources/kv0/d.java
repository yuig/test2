package kv0;

import ac2.e1;
import ac2.q1;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.tp;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kh2.a1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80946i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f80947j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(1);
        this.f80946i = i13;
        this.f80947j = fVar;
    }

    public final void b(ln0 updatedData) {
        ln0 ln0Var;
        tp pageData;
        int i13 = this.f80946i;
        int i14 = 1;
        f fVar = this.f80947j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(updatedData, "updatedData");
                jv0.j jVar = fVar.f80960l;
                if (jVar != null) {
                    String j13 = updatedData.j();
                    ((mv0.y) jVar).Y8(j13 != null ? Uri.fromFile(new File(j13)) : null);
                    break;
                }
                break;
            case 1:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(updatedData, "storyPinLocalData");
                jv0.j jVar2 = fVar.f80960l;
                if (jVar2 != null) {
                    ((mv0.y) jVar2).X8(!Intrinsics.d(updatedData, fVar.f80961m));
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(updatedData, "it");
                ((mv0.y) fVar.f80952d).U8();
                break;
            case 3:
                if (Intrinsics.d(updatedData, fVar.f80961m)) {
                    ((mv0.y) fVar.f80952d).U8();
                    break;
                } else {
                    jv0.j jVar3 = fVar.f80960l;
                    if (jVar3 != null) {
                        mv0.y yVar = (mv0.y) jVar3;
                        FragmentActivity requireActivity = yVar.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        Context requireContext = yVar.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        a1.A0(requireActivity, requireContext, new mv0.w(yVar, i14), new mv0.w(yVar, 2));
                        break;
                    }
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(updatedData, "it");
                ((mv0.y) fVar.f80952d).U8();
                break;
            case 5:
                Intrinsics.f(updatedData);
                fVar.c(updatedData, new d(fVar, 4));
                break;
            case 7:
                if (fVar.f80961m == null) {
                    Intrinsics.f(updatedData);
                    String str = fVar.f80951c;
                    if (str != null && str.length() != 0 && (pageData = updatedData.getPageData()) != null) {
                        List<qq> overlayBlocks = pageData.getOverlayBlocks();
                        ArrayList H0 = CollectionsKt.H0(overlayBlocks);
                        for (qq qqVar : overlayBlocks) {
                            mq mqVar = qqVar instanceof mq ? (mq) qqVar : null;
                            if (Intrinsics.d(mqVar != null ? mqVar.getPinId() : null, str)) {
                                H0.remove(mqVar);
                            }
                        }
                        if (!Intrinsics.d(H0, overlayBlocks)) {
                            ln0Var = uv0.n.a(updatedData, false, tp.e(pageData, null, null, null, null, null, H0, null, null, null, null, null, null, 4063));
                            fVar.f80961m = ln0Var;
                        }
                    }
                    ln0Var = updatedData;
                    fVar.f80961m = ln0Var;
                }
                Intrinsics.f(updatedData);
                Intrinsics.checkNotNullParameter(updatedData, "storyPinLocalData");
                long l13 = updatedData.l();
                String j14 = updatedData.j();
                v vVar = new v(j14 != null ? Uri.fromFile(new File(j14)) : null, l13 > 0 ? ac2.d.a(l13, q1.VIDEO_DRAFT, e1.ROUND) : null);
                jv0.j jVar4 = fVar.f80960l;
                if (jVar4 != null) {
                    ((mv0.y) jVar4).Z8(vVar.f81021b);
                }
                jv0.j jVar5 = fVar.f80960l;
                if (jVar5 != null) {
                    ((mv0.y) jVar5).Y8(vVar.f81020a);
                }
                jv0.j jVar6 = fVar.f80960l;
                if (jVar6 != null) {
                    ((mv0.y) jVar6).X8(!Intrinsics.d(updatedData, fVar.f80961m));
                    break;
                }
                break;
        }
    }

    public final void e(Throwable throwable) {
        int i13 = this.f80946i;
        f fVar = this.f80947j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                jv0.j jVar = fVar.f80960l;
                if (jVar != null) {
                    int i14 = x0.try_again;
                    i92.k kVar = ((mv0.y) jVar).D0;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.h(i14);
                }
                fVar.f80958j.q(throwable, "IdeaPinProductTagsPresenter: generate adjusted image for publishing", tb0.p.IDEA_PINS_CREATION);
                return;
            default:
                Intrinsics.checkNotNullParameter(throwable, "it");
                jv0.j jVar2 = fVar.f80960l;
                if (jVar2 != null) {
                    ((mv0.y) jVar2).X8(true);
                }
                jv0.j jVar3 = fVar.f80960l;
                if (jVar3 != null) {
                    ((mv0.y) jVar3).W8(true);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80946i) {
            case 0:
                b((ln0) obj);
                break;
            case 1:
                e((Throwable) obj);
                break;
            case 2:
                b((ln0) obj);
                break;
            case 3:
                b((ln0) obj);
                break;
            case 4:
                b((ln0) obj);
                break;
            case 5:
                b((ln0) obj);
                break;
            case 6:
                e((Throwable) obj);
                break;
            case 7:
                b((ln0) obj);
                break;
            default:
                b((ln0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
