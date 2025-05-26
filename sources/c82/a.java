package c82;

import android.webkit.URLUtil;
import com.pinterest.api.model.my0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final my0 f26948a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26950c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26951d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26952e;

    public a(my0 my0Var) {
        this.f26948a = my0Var;
        this.f26949b = my0Var != null ? my0Var.f40258a : null;
        this.f26950c = my0Var != null ? my0Var.f40260c : null;
        this.f26951d = my0Var != null ? my0Var.f40261d : null;
        this.f26952e = my0Var != null ? my0Var.f40259b : null;
    }

    public final boolean a() {
        String str;
        String str2;
        String str3 = this.f26949b;
        return str3 == null || str3.length() == 0 || (str = this.f26951d) == null || str.length() == 0 || (str2 = this.f26950c) == null || str2.length() == 0 || !URLUtil.isValidUrl(this.f26952e);
    }
}
