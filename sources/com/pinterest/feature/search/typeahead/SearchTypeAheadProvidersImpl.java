package com.pinterest.feature.search.typeahead;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import o71.l0;
import org.jetbrains.annotations.NotNull;
import px0.g;
import r41.k;
import so.oa;
import uj2.q;
import uk1.d;
import up0.b;
import vq0.h;
import vy.m;
import yk1.n;
import zp0.j;

@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J7\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/pinterest/feature/search/typeahead/SearchTypeAheadProvidersImpl;", "Lup0/b;", "Lyk1/n;", "M", "Luk1/d;", "presenterPinalytics", "", "viewType", "Lvq0/h;", "Lbr/d;", "getViewBinder", "(Luk1/d;Ljava/lang/Integer;)Lvq0/h;", "Landroid/view/View;", "V", "Landroid/content/Context;", "context", "Lzp0/j;", "styles", "Lkotlin/Function0;", "getView", "(Landroid/content/Context;Lzp0/j;Ljava/lang/Integer;)Lkotlin/jvm/functions/Function0;", "Lcom/pinterest/feature/search/typeahead/SearchTypeAheadProvidersImpl$a;", "searchTypeAheadProvidersEntryPoint", "Lcom/pinterest/feature/search/typeahead/SearchTypeAheadProvidersImpl$a;", "Luj2/q;", "", "networkStateStream", "Luj2/q;", "Lm60/w;", "eventManager", "Lm60/w;", "Lvy/m;", "analyticsApi", "Lvy/m;", "<init>", "()V", "a", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeAheadProvidersImpl implements b {

    @NotNull
    private final m analyticsApi;

    @NotNull
    private final w eventManager;

    @NotNull
    private final q<Boolean> networkStateStream;

    @NotNull
    private final a searchTypeAheadProvidersEntryPoint;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/pinterest/feature/search/typeahead/SearchTypeAheadProvidersImpl$a;", "", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public interface a {
    }

    public SearchTypeAheadProvidersImpl() {
        Context context = kb0.a.f79058b;
        a aVar = (a) ep.b.g(a.class);
        this.searchTypeAheadProvidersEntryPoint = aVar;
        oa oaVar = (oa) aVar;
        this.networkStateStream = oaVar.u2();
        this.eventManager = (w) oaVar.f113885r0.get();
        this.analyticsApi = (m) oaVar.M1.get();
    }

    @Override // up0.b
    @NotNull
    public <V extends View> Function0<V> getView(@NotNull Context context, j styles, Integer viewType) {
        Intrinsics.checkNotNullParameter(context, "context");
        g gVar = new g(viewType, context, styles, 5);
        dl2.b.y(0, gVar);
        return gVar;
    }

    @Override // up0.b
    @NotNull
    public <M extends n> h getViewBinder(@NotNull d presenterPinalytics, Integer viewType) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        if (viewType != null && viewType.intValue() == 22) {
            q<Boolean> qVar = this.networkStateStream;
            l0 l0Var = new l0(presenterPinalytics, this.analyticsApi);
            k kVar = k.f106176a;
            r71.a aVar = new r71.a(presenterPinalytics, qVar, l0Var, this.eventManager, 0);
            switch (aVar.f106399a) {
                case 0:
                    aVar.f106406h = true;
                    return aVar;
                default:
                    aVar.f106406h = true;
                    return aVar;
            }
        }
        q<Boolean> qVar2 = this.networkStateStream;
        l0 l0Var2 = new l0(presenterPinalytics, this.analyticsApi);
        k kVar2 = k.f106176a;
        r71.a aVar2 = new r71.a(presenterPinalytics, qVar2, l0Var2, this.eventManager, 1);
        switch (aVar2.f106399a) {
            case 0:
                aVar2.f106406h = true;
                return aVar2;
            default:
                aVar2.f106406h = true;
                return aVar2;
        }
    }
}
