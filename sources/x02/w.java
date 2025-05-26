package x02;

import a.cb;

/* loaded from: classes4.dex */
public final class w extends t1 {

    /* renamed from: f, reason: collision with root package name */
    public final String f131509f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f131510g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131511h;

    /* renamed from: i, reason: collision with root package name */
    public final x f131512i;

    /* renamed from: j, reason: collision with root package name */
    public final String f131513j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f131514k;

    public w(String str, x xVar, boolean z13) {
        super(2);
        x xVar2 = x.ALL_BOARDS_FILTER;
        this.f131514k = false;
        this.f131509f = str;
        this.f131511h = null;
        this.f131512i = xVar;
        this.f131510g = z13;
        this.f131513j = null;
    }

    @Override // x02.t1
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            w wVar = (w) obj;
            if (this.f131509f.equals(wVar.f131509f)) {
                String str = this.f131511h;
                String str2 = "alphabetical";
                if (str == null || str.isEmpty()) {
                    str = "alphabetical";
                }
                String str3 = wVar.f131511h;
                if (str3 != null && !str3.isEmpty()) {
                    str2 = str3;
                }
                if (str.equals(str2) && this.f131513j == wVar.f131513j && this.f131514k == wVar.f131514k) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x02.t1
    public final int hashCode() {
        int d2 = cb.d(this.f131509f, super.hashCode() * 31, 31);
        String str = this.f131511h;
        if (str == null || str.isEmpty()) {
            str = "alphabetical";
        }
        return str.hashCode() + d2;
    }

    public w(int i13, String str, String str2, x xVar, boolean z13, String str3, boolean z14) {
        super(i13);
        x xVar2 = x.ALL_BOARDS_FILTER;
        this.f131509f = str;
        this.f131511h = str2;
        this.f131512i = xVar;
        this.f131510g = z13;
        this.f131513j = str3;
        this.f131514k = z14;
    }

    public w(String str, int i13, String str2, boolean z13) {
        this(i13, str, str2, x.ALL_BOARDS_FILTER, z13, null, false);
    }

    public w(int i13, String str) {
        this(i13, str, null, x.ALL_BOARDS_FILTER, false, null, false);
    }

    public w(int i13, String str, int i14) {
        super(i13, str);
        x xVar = x.ALL_BOARDS_FILTER;
        this.f131514k = false;
        this.f131509f = "";
        this.f131511h = null;
        this.f131512i = xVar;
        this.f131510g = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str) {
        super(4);
        x xVar = x.ALL_BOARDS_FILTER;
        this.f131514k = false;
        this.f131509f = str;
        this.f131511h = null;
        this.f131512i = xVar;
        this.f131510g = false;
        this.f131513j = null;
    }
}
