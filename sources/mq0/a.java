package mq0;

import com.pinterest.api.model.mv;
import kotlin.jvm.internal.Intrinsics;
import lq0.b1;
import nx.d0;
import uj2.q;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final mv f88046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88047b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88048c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f88049d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f88050e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f88051f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f88052g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f88053h;

    /* renamed from: i, reason: collision with root package name */
    public final d f88054i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f88055j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f88056k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f88057l;

    /* renamed from: m, reason: collision with root package name */
    public final b1 f88058m;

    public a(mv messageModel, int i13, String convoId, d0 pinalytics, q networkStateStream, boolean z13, boolean z14, boolean z15, boolean z16, d threadChainPosition, boolean z17, boolean z18, boolean z19, b1 convoThreadViewState) {
        Intrinsics.checkNotNullParameter(messageModel, "messageModel");
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(threadChainPosition, "threadChainPosition");
        Intrinsics.checkNotNullParameter(convoThreadViewState, "convoThreadViewState");
        this.f88046a = messageModel;
        this.f88047b = i13;
        this.f88048c = convoId;
        this.f88049d = pinalytics;
        this.f88050e = z13;
        this.f88051f = z14;
        this.f88052g = z15;
        this.f88053h = z16;
        this.f88054i = threadChainPosition;
        this.f88055j = z17;
        this.f88056k = z18;
        this.f88057l = z19;
        this.f88058m = convoThreadViewState;
    }
}
