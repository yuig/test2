package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class xb {

    /* renamed from: a, reason: collision with root package name */
    @om.b("ENGAGEMENT")
    private List<tb> f43636a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("IMPRESSION")
    private List<tb> f43637b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("OUTBOUND_CLICK")
    private List<tb> f43638c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("PIN_CLICK")
    private List<tb> f43639d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("QUARTILE_95_PERCENT_VIEW")
    private List<tb> f43640e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("SAVE")
    private List<tb> f43641f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("VIDEO_10S_VIEW")
    private List<tb> f43642g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("VIDEO_AVG_WATCH_TIME")
    private List<tb> f43643h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("VIDEO_MRC_VIEW")
    private List<tb> f43644i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("VIDEO_V50_WATCH_TIME")
    private List<tb> f43645j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("date_availability")
    private w30 f43646k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f43647l;

    public /* synthetic */ xb(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, w30 w30Var, boolean[] zArr, int i13) {
        this(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, w30Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xb xbVar = (xb) obj;
        return Objects.equals(this.f43636a, xbVar.f43636a) && Objects.equals(this.f43637b, xbVar.f43637b) && Objects.equals(this.f43638c, xbVar.f43638c) && Objects.equals(this.f43639d, xbVar.f43639d) && Objects.equals(this.f43640e, xbVar.f43640e) && Objects.equals(this.f43641f, xbVar.f43641f) && Objects.equals(this.f43642g, xbVar.f43642g) && Objects.equals(this.f43643h, xbVar.f43643h) && Objects.equals(this.f43644i, xbVar.f43644i) && Objects.equals(this.f43645j, xbVar.f43645j) && Objects.equals(this.f43646k, xbVar.f43646k);
    }

    public final int hashCode() {
        return Objects.hash(this.f43636a, this.f43637b, this.f43638c, this.f43639d, this.f43640e, this.f43641f, this.f43642g, this.f43643h, this.f43644i, this.f43645j, this.f43646k);
    }

    public final w30 l() {
        return this.f43646k;
    }

    public final List m() {
        return this.f43636a;
    }

    public final List n() {
        return this.f43637b;
    }

    public final List o() {
        return this.f43638c;
    }

    public final List p() {
        return this.f43639d;
    }

    public final List q() {
        return this.f43640e;
    }

    public final List r() {
        return this.f43641f;
    }

    public final List s() {
        return this.f43642g;
    }

    public final List t() {
        return this.f43643h;
    }

    public final List u() {
        return this.f43644i;
    }

    public final List v() {
        return this.f43645j;
    }

    public xb() {
        this.f43647l = new boolean[11];
    }

    private xb(List<tb> list, List<tb> list2, List<tb> list3, List<tb> list4, List<tb> list5, List<tb> list6, List<tb> list7, List<tb> list8, List<tb> list9, List<tb> list10, w30 w30Var, boolean[] zArr) {
        this.f43636a = list;
        this.f43637b = list2;
        this.f43638c = list3;
        this.f43639d = list4;
        this.f43640e = list5;
        this.f43641f = list6;
        this.f43642g = list7;
        this.f43643h = list8;
        this.f43644i = list9;
        this.f43645j = list10;
        this.f43646k = w30Var;
        this.f43647l = zArr;
    }
}
