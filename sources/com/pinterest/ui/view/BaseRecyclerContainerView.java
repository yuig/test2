package com.pinterest.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.y2;
import ao2.i0;
import ao2.j0;
import ao2.m2;
import ar0.f;
import ar0.g;
import ar0.n;
import ar0.r;
import ar0.s;
import ar0.u;
import ar0.w;
import ar0.y;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import dl2.b;
import hb2.d;
import ho2.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.a;
import nx.d0;
import nx.o0;
import nx.v;
import org.jetbrains.annotations.NotNull;
import q5.m0;
import q5.v0;
import sq0.f0;
import sq0.x;
import tq0.h;
import ue.c;
import vq0.i;
import xk2.k;
import yq0.a0;
import yq0.z;
import zy.m;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001c\b\u0016\u0012\u0006\u0010|\u001a\u00020{\u0012\b\u0010~\u001a\u0004\u0018\u00010}¢\u0006\u0005\b\u007f\u0010\u0080\u0001B%\b\u0016\u0012\u0006\u0010|\u001a\u00020{\u0012\b\u0010~\u001a\u0004\u0018\u00010}\u0012\u0007\u0010\u0081\u0001\u001a\u000206¢\u0006\u0005\b\u007f\u0010\u0082\u0001J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\rJ\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\rJ\u0019\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010\u0013J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010%\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u0001082\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020GH\u0016¢\u0006\u0004\bJ\u0010IJ\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020KH\u0016¢\u0006\u0004\bN\u0010MJ\u000f\u0010P\u001a\u00020OH\u0014¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000bH\u0004¢\u0006\u0004\bR\u0010\rJ\u000f\u0010S\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010\rR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010Y\u001a\u00020W2\u0006\u0010X\u001a\u00020W8\u0006@BX\u0086.¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020]8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010iR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010jR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010_\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010_\u001a\u0004\br\u0010sR\u0016\u0010u\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020w8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006\u0083\u0001"}, d2 = {"Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "D", "Lcom/pinterest/ui/view/VideoViewabilityLinearLayout;", "Lsq0/x;", "Lnx/d0;", "getPinalytics", "()Lnx/d0;", "Lnx/a;", "provideContextProvider", "()Lnx/a;", "", "onActivated", "()V", "onDeactivated", "startImpressionsForCurrentChildImpressionViews", "", "shouldForceDumpImpressions", "endImpressionsForCurrentChildImpressionViews", "(Z)V", "releaseAdapter", "pinalytics", "setPinalytics", "(Lnx/d0;)V", "contextProvider", "setContextProvider", "(Lnx/a;)V", "dataSource", "initializeAdapter", "(Lyq0/a0;)V", "Lsq0/f0;", "dataSourceProvider", "initializeMultiSourceAdapter", "(Lsq0/f0;)V", "resetRecyclerScrollListener", "makeScrollListenerReadyToLoadMore", "Lsq0/w;", "listener", "setLoadMoreListener", "(Lsq0/w;)V", "refreshing", "setRefreshing", "visible", "setShowPaginationSpinner", "", "throwable", "displayError", "(Ljava/lang/Throwable;)V", "Lsq0/a0;", "setRefreshListener", "(Lsq0/a0;)V", "Lsq0/z;", "addItemVisibilityChangeListener", "(Lsq0/z;)V", "", "position", "Lyk1/m;", "getChildPresenterForAdapterPosition", "(I)Lyk1/m;", "Lar0/x;", "addLifecycleListener", "(Lar0/x;)V", "Lar0/y;", "addScrollListener", "(Lar0/y;)V", "Lar0/w;", "addItemLocationEventsListener", "(Lar0/w;)V", "Lar0/r;", "addAttachStateListener", "(Lar0/r;)V", "Lar0/u;", "addFocusChangeListener", "(Lar0/u;)V", "removeFocusChangeListener", "Lar0/s;", "addRecyclerViewEventListener", "(Lar0/s;)V", "removeRecyclerViewEventListener", "Lar0/f;", "getLoadMorePolicy", "()Lar0/f;", "addImpressionLoggers", "onLoadMoreComplete", "Lao2/j0;", "adapterScope", "Lao2/j0;", "Lcom/pinterest/ui/grid/PinterestRecyclerView;", "<set-?>", "pinterestRecyclerView", "Lcom/pinterest/ui/grid/PinterestRecyclerView;", "getPinterestRecyclerView", "()Lcom/pinterest/ui/grid/PinterestRecyclerView;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager$delegate", "Lxk2/k;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Lyq0/z;", "adapter", "Lyq0/z;", "Lar0/g;", "infiniteScrollListener", "Lar0/g;", "Lnx/d0;", "Lnx/a;", "Ltq0/h;", "loggingCoordinator$delegate", "getLoggingCoordinator", "()Ltq0/h;", "loggingCoordinator", "Lar0/n;", "recyclerEventListener$delegate", "a", "()Lar0/n;", "recyclerEventListener", "isActive", "Z", "Lsq0/d0;", "getRecyclerAdapter", "()Lsq0/d0;", "recyclerAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseRecyclerContainerView<D extends a0> extends VideoViewabilityLinearLayout implements x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f52670a = 0;
    private z adapter;

    @NotNull
    private j0 adapterScope;
    private a contextProvider;
    private g infiniteScrollListener;
    private boolean isActive;

    /* renamed from: linearLayoutManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final k linearLayoutManager;

    /* renamed from: loggingCoordinator$delegate, reason: from kotlin metadata */
    @NotNull
    private final k loggingCoordinator;
    private d0 pinalytics;
    private PinterestRecyclerView pinterestRecyclerView;

    /* renamed from: recyclerEventListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final k recyclerEventListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerContainerView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$addEventListeners(BaseRecyclerContainerView baseRecyclerContainerView, n nVar) {
        PinterestRecyclerView pinterestRecyclerView = baseRecyclerContainerView.getPinterestRecyclerView();
        pinterestRecyclerView.b(nVar);
        pinterestRecyclerView.f52531a.n(nVar);
        pinterestRecyclerView.f52532b.add(nVar);
    }

    public static /* synthetic */ b1 createLayoutManagerContract$default(BaseRecyclerContainerView baseRecyclerContainerView, int i13, boolean z13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayoutManagerContract");
        }
        if ((i14 & 1) != 0) {
            i13 = 1;
        }
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        return baseRecyclerContainerView.createLayoutManagerContract(i13, z13);
    }

    public static /* synthetic */ void endImpressionsForCurrentChildImpressionViews$default(BaseRecyclerContainerView baseRecyclerContainerView, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endImpressionsForCurrentChildImpressionViews");
        }
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        baseRecyclerContainerView.endImpressionsForCurrentChildImpressionViews(z13);
    }

    public final n a() {
        return (n) this.recyclerEventListener.getValue();
    }

    public void addAttachStateListener(@NotNull r listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        n a13 = a();
        a13.getClass();
        Intrinsics.checkNotNullParameter(listener, "attachStateListener");
        a13.f20399c.add(listener);
    }

    public void addFocusChangeListener(@NotNull u listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        n a13 = a();
        a13.getClass();
        Intrinsics.checkNotNullParameter(listener, "focusChangeListener");
        a13.f20400d.add(listener);
        getPinterestRecyclerView().f52532b.add(listener);
    }

    public final void addImpressionLoggers() {
        m[] createImpressionLoggers = createImpressionLoggers(pb0.g.f99432a, this.pinalytics, o0.f92437i);
        if (createImpressionLoggers.length == 0) {
            return;
        }
        h hVar = (h) this.loggingCoordinator.getValue();
        hVar.n((m[]) Arrays.copyOf(createImpressionLoggers, createImpressionLoggers.length));
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(hVar);
    }

    public void addItemLocationEventsListener(@NotNull w listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        a().l(listener);
    }

    @Override // sq0.b0
    public void addItemVisibilityChangeListener(@NotNull sq0.z listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void addLifecycleListener(@NotNull ar0.x listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        n a13 = a();
        a13.getClass();
        Intrinsics.checkNotNullParameter(listener, "lifecycleListener");
        a13.f20397a.add(listener);
    }

    @Override // ar0.t
    public void addRecyclerViewEventListener(@NotNull s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        n a13 = a();
        a13.getClass();
        Intrinsics.checkNotNullParameter(listener, "lifecycleListener");
        a13.f20397a.add(listener);
        a13.k(listener);
        Intrinsics.checkNotNullParameter(listener, "attachStateListener");
        a13.f20399c.add(listener);
        a13.l(listener);
        addFocusChangeListener(listener);
    }

    @Override // ar0.t
    public void addScrollListener(@NotNull y listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        a().k(listener);
    }

    public m[] createImpressionLoggers(pb0.a clock, d0 d0Var, o0 pinalyticsManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return new m[0];
    }

    public b1 createLayoutManagerContract(int i13, boolean z13) {
        g41.a aVar = new g41.a(this, 22);
        getContext();
        PinterestLinearLayoutManager layoutManager = new PinterestLinearLayoutManager(aVar, i13, z13);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    @Override // sq0.b0
    public void displayError(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public final void endImpressionsForCurrentChildImpressionViews(boolean shouldForceDumpImpressions) {
        KeyEvent.Callback callback;
        y2 Y0 = getPinterestRecyclerView().f52531a.Y0(getLinearLayoutManager().h1(), false);
        if (Y0 == null || (callback = Y0.f19717a) == null) {
            return;
        }
        v vVar = callback instanceof v ? (v) callback : null;
        Object markImpressionEnd = vVar != null ? vVar.markImpressionEnd() : null;
        if (markImpressionEnd != null) {
            ((h) this.loggingCoordinator.getValue()).x(markImpressionEnd);
            if (shouldForceDumpImpressions) {
                ((h) this.loggingCoordinator.getValue()).q();
            }
        }
    }

    public yk1.m getChildPresenterForAdapterPosition(int position) {
        return j1.h0(getPinterestRecyclerView(), position);
    }

    public abstract String getDebugTag();

    public abstract int getLayoutResourceId();

    @NotNull
    public final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) this.linearLayoutManager.getValue();
    }

    @NotNull
    public f getLoadMorePolicy() {
        return new bk.f();
    }

    public final d0 getPinalytics() {
        return this.pinalytics;
    }

    @NotNull
    public final PinterestRecyclerView getPinterestRecyclerView() {
        PinterestRecyclerView pinterestRecyclerView = this.pinterestRecyclerView;
        if (pinterestRecyclerView != null) {
            return pinterestRecyclerView;
        }
        Intrinsics.r("pinterestRecyclerView");
        throw null;
    }

    public abstract int getPinterestRecyclerViewId();

    @Override // sq0.b0
    @NotNull
    public sq0.d0 getRecyclerAdapter() {
        z zVar = this.adapter;
        if (zVar != null) {
            return zVar;
        }
        Intrinsics.r("adapter");
        throw null;
    }

    public void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, getLayoutResourceId(), this);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        View findViewById = findViewById(getPinterestRecyclerViewId());
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById;
        pinterestRecyclerView.l(getLinearLayoutManager());
        g gVar = new g(pinterestRecyclerView.f52535e, getLoadMorePolicy());
        this.infiniteScrollListener = gVar;
        pinterestRecyclerView.b(gVar);
        RecyclerView recyclerView = pinterestRecyclerView.f52531a;
        WeakHashMap weakHashMap = v0.f102521a;
        m0.m(recyclerView, false);
        Intrinsics.checkNotNullExpressionValue(findViewById, "also(...)");
        this.pinterestRecyclerView = pinterestRecyclerView;
        observeVideoViewabilityEvents();
    }

    @Override // sq0.b0
    public void initializeAdapter(@NotNull D dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        z zVar = new z(new i(dataSource), this.adapterScope, 12);
        registerViewHolderCreators(zVar);
        this.adapter = zVar;
        PinterestRecyclerView pinterestRecyclerView = getPinterestRecyclerView();
        z zVar2 = this.adapter;
        if (zVar2 != null) {
            pinterestRecyclerView.j(zVar2);
        } else {
            Intrinsics.r("adapter");
            throw null;
        }
    }

    @Override // sq0.b0
    public void initializeMultiSourceAdapter(@NotNull f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        z zVar = new z(dataSourceProvider, this.adapterScope, 12);
        registerViewHolderCreators(zVar);
        this.adapter = zVar;
        PinterestRecyclerView pinterestRecyclerView = getPinterestRecyclerView();
        z zVar2 = this.adapter;
        if (zVar2 != null) {
            pinterestRecyclerView.j(zVar2);
        } else {
            Intrinsics.r("adapter");
            throw null;
        }
    }

    @Override // sq0.b0
    public void makeScrollListenerReadyToLoadMore() {
        g gVar = this.infiniteScrollListener;
        if (gVar != null) {
            gVar.f20375b = false;
        } else {
            Intrinsics.r("infiniteScrollListener");
            throw null;
        }
    }

    public final void onActivated() {
        if (this.isActive) {
            return;
        }
        this.isActive = true;
        h hVar = (h) this.loggingCoordinator.getValue();
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
        hVar.h(recyclerView);
        n a13 = a();
        RecyclerView recyclerView2 = getPinterestRecyclerView().f52531a;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "getRecyclerView(...)");
        a13.h(recyclerView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!b.x1(this.adapterScope)) {
            m2 b13 = c.b();
            ko2.f fVar = ao2.v0.f20219a;
            this.adapterScope = b.b(kotlin.coroutines.g.d(q.f69782a, b13).plus(new i0("BaseRecyclerContainerView Adapter")));
        }
        n a13 = a();
        PinterestRecyclerView pinterestRecyclerView = getPinterestRecyclerView();
        pinterestRecyclerView.b(a13);
        pinterestRecyclerView.f52531a.n(a13);
        pinterestRecyclerView.f52532b.add(a13);
        addImpressionLoggers();
        n a14 = a();
        PinterestRecyclerView pinterestRecyclerView2 = getPinterestRecyclerView();
        pinterestRecyclerView2.b(a14);
        pinterestRecyclerView2.f52531a.n(a14);
        onActivated();
    }

    public final void onDeactivated() {
        if (this.isActive) {
            this.isActive = false;
            h hVar = (h) this.loggingCoordinator.getValue();
            RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
            hVar.a(recyclerView);
            n a13 = a();
            RecyclerView recyclerView2 = getPinterestRecyclerView().f52531a;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "getRecyclerView(...)");
            a13.a(recyclerView2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        onDeactivated();
        n a13 = a();
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
        a13.f(recyclerView);
        PinterestRecyclerView pinterestRecyclerView = getPinterestRecyclerView();
        pinterestRecyclerView.e(a13);
        ArrayList arrayList = pinterestRecyclerView.f52531a.C;
        if (arrayList != null) {
            arrayList.remove(a13);
        }
        pinterestRecyclerView.f52532b.remove(a13);
        b.E(this.adapterScope, null);
        super.onDetachedFromWindow();
    }

    @Override // sq0.b0
    public void onLoadMoreComplete() {
        g gVar = this.infiniteScrollListener;
        if (gVar != null) {
            if (gVar != null) {
                gVar.l();
            } else {
                Intrinsics.r("infiniteScrollListener");
                throw null;
            }
        }
    }

    /* renamed from: provideContextProvider, reason: from getter */
    public final a getContextProvider() {
        return this.contextProvider;
    }

    public abstract void registerViewHolderCreators(z zVar);

    @Override // sq0.b0
    public void releaseAdapter() {
        getPinterestRecyclerView().f52531a.H2(null);
    }

    public void removeFocusChangeListener(@NotNull u listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPinterestRecyclerView().f52532b.remove(listener);
        n a13 = a();
        a13.getClass();
        Intrinsics.checkNotNullParameter(listener, "focusChangeListener");
        a13.f20400d.remove(listener);
    }

    public void removeRecyclerViewEventListener(@NotNull s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        removeFocusChangeListener(listener);
        n a13 = a();
        a13.n(listener);
        Intrinsics.checkNotNullParameter(listener, "attachStateListener");
        a13.f20399c.remove(listener);
        Intrinsics.checkNotNullParameter(listener, "scrollListener");
        a13.f20398b.remove(listener);
        Intrinsics.checkNotNullParameter(listener, "lifecycleListener");
        a13.f20397a.remove(listener);
    }

    @Override // sq0.b0
    public void resetRecyclerScrollListener() {
        g gVar = this.infiniteScrollListener;
        if (gVar == null) {
            Intrinsics.r("infiniteScrollListener");
            throw null;
        }
        gVar.f20374a = 0;
        gVar.f20375b = true;
    }

    public final void setContextProvider(@NotNull a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.contextProvider = contextProvider;
    }

    @Override // sq0.b0
    public void setLoadMoreListener(sq0.w listener) {
        g gVar = this.infiniteScrollListener;
        if (gVar != null) {
            gVar.f20379f = listener;
        } else {
            Intrinsics.r("infiniteScrollListener");
            throw null;
        }
    }

    public void setPinalytics(@NotNull d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.pinalytics = pinalytics;
    }

    @Override // sq0.b0
    public void setRefreshListener(sq0.a0 listener) {
    }

    @Override // sq0.b0
    public void setRefreshing(boolean refreshing) {
    }

    @Override // sq0.b0
    public void setShowPaginationSpinner(boolean visible) {
    }

    public final void startImpressionsForCurrentChildImpressionViews() {
        KeyEvent.Callback callback;
        y2 Y0 = getPinterestRecyclerView().f52531a.Y0(getLinearLayoutManager().h1(), false);
        if (Y0 == null || (callback = Y0.f19717a) == null) {
            return;
        }
        v vVar = callback instanceof v ? (v) callback : null;
        if (vVar != null) {
            vVar.markImpressionStart();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerContainerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        m2 b13 = c.b();
        ko2.f fVar = ao2.v0.f20219a;
        this.adapterScope = b.b(kotlin.coroutines.g.d(q.f69782a, b13).plus(new i0("BaseRecyclerContainerView Adapter")));
        this.linearLayoutManager = xk2.m.b(new hb2.c(this, 0));
        this.loggingCoordinator = xk2.m.b(d.f68549i);
        this.recyclerEventListener = xk2.m.b(new hb2.c(this, 1));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        init(context2);
    }
}
