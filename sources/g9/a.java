package g9;

import a.cb;
import a7.k0;
import a7.m0;
import com.bumptech.glide.c;
import d7.b;

/* loaded from: classes3.dex */
public final class a implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f64501a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64502b;

    public a(String str, String str2) {
        this.f64501a = c.r1(str);
        this.f64502b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a7.m0
    public final void b(k0 k0Var) {
        String str = this.f64501a;
        str.getClass();
        char c13 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c13 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c13 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c13 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c13 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c13 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c13 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c13 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c13 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c13 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c13 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f64502b;
        switch (c13) {
            case 0:
                Integer E0 = b.E0(str2);
                if (E0 != null) {
                    k0Var.f1103m = E0;
                    break;
                }
                break;
            case 1:
                Integer E02 = b.E0(str2);
                if (E02 != null) {
                    k0Var.A = E02;
                    break;
                }
                break;
            case 2:
                Integer E03 = b.E0(str2);
                if (E03 != null) {
                    k0Var.f1102l = E03;
                    break;
                }
                break;
            case 3:
                k0Var.f1093c = str2;
                break;
            case 4:
                k0Var.B = str2;
                break;
            case 5:
                k0Var.f1091a = str2;
                break;
            case 6:
                k0Var.f1097g = str2;
                break;
            case 7:
                Integer E04 = b.E0(str2);
                if (E04 != null) {
                    k0Var.f1116z = E04;
                    break;
                }
                break;
            case '\b':
                k0Var.f1094d = str2;
                break;
            case '\t':
                k0Var.f1092b = str2;
                break;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f64501a.equals(aVar.f64501a) && this.f64502b.equals(aVar.f64502b);
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f64502b.hashCode() + cb.d(this.f64501a, 527, 31);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "VC: " + this.f64501a + "=" + this.f64502b;
    }
}
