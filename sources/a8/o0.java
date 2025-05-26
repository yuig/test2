package a8;

import android.net.Uri;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import java.util.Objects;
import pk.h1;
import pk.v2;
import pk.x0;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a */
    public final h1 f1413a;

    /* renamed from: b */
    public final v2 f1414b;

    /* renamed from: c */
    public final String f1415c;

    /* renamed from: d */
    public final String f1416d;

    /* renamed from: e */
    public final String f1417e;

    /* renamed from: f */
    public final int f1418f;

    /* renamed from: g */
    public final Uri f1419g;

    /* renamed from: h */
    public final String f1420h;

    /* renamed from: i */
    public final String f1421i;

    /* renamed from: j */
    public final String f1422j;

    /* renamed from: k */
    public final String f1423k;

    /* renamed from: l */
    public final String f1424l;

    public o0(n0 n0Var) {
        this.f1413a = h1.c((HashMap) n0Var.f1403c);
        this.f1414b = ((x0) n0Var.f1404d).i();
        String str = n0Var.f1401a;
        int i13 = d7.n0.f53866a;
        this.f1415c = str;
        this.f1416d = (String) n0Var.f1405e;
        this.f1417e = (String) n0Var.f1406f;
        this.f1419g = (Uri) n0Var.f1412l;
        this.f1420h = (String) n0Var.f1407g;
        this.f1418f = n0Var.f1402b;
        this.f1421i = (String) n0Var.f1408h;
        this.f1422j = (String) n0Var.f1410j;
        this.f1423k = (String) n0Var.f1411k;
        this.f1424l = (String) n0Var.f1409i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f1418f == o0Var.f1418f) {
            h1 h1Var = this.f1413a;
            h1Var.getClass();
            if (bf.b.M(o0Var.f1413a, h1Var) && this.f1414b.equals(o0Var.f1414b) && Objects.equals(this.f1416d, o0Var.f1416d) && Objects.equals(this.f1415c, o0Var.f1415c) && Objects.equals(this.f1417e, o0Var.f1417e) && Objects.equals(this.f1424l, o0Var.f1424l) && Objects.equals(this.f1419g, o0Var.f1419g) && Objects.equals(this.f1422j, o0Var.f1422j) && Objects.equals(this.f1423k, o0Var.f1423k) && Objects.equals(this.f1420h, o0Var.f1420h) && Objects.equals(this.f1421i, o0Var.f1421i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1414b.hashCode() + ((this.f1413a.hashCode() + RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER) * 31)) * 31;
        String str = this.f1416d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1415c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1417e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f1418f) * 31;
        String str4 = this.f1424l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f1419g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f1422j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f1423k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f1420h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f1421i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
