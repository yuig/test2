package fj2;

import java.util.StringJoiner;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f62255a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62256b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62257c;

    /* renamed from: d, reason: collision with root package name */
    public final String f62258d;

    /* renamed from: e, reason: collision with root package name */
    public final String f62259e;

    /* renamed from: f, reason: collision with root package name */
    public final String f62260f;

    public a(b bVar, String str, String str2, String str3, String str4, String str5) {
        this.f62255a = bVar;
        this.f62256b = str;
        this.f62257c = str2;
        this.f62258d = str3;
        this.f62259e = str4;
        this.f62260f = str5;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "InstrumentSelector{", "}");
        b bVar = this.f62255a;
        if (bVar != null) {
            stringJoiner.add("instrumentType=" + bVar);
        }
        String str = this.f62256b;
        if (str != null) {
            stringJoiner.add("instrumentName=" + str);
        }
        String str2 = this.f62257c;
        if (str2 != null) {
            stringJoiner.add("instrumentUnit=" + str2);
        }
        String str3 = this.f62258d;
        if (str3 != null) {
            stringJoiner.add("meterName=" + str3);
        }
        String str4 = this.f62259e;
        if (str4 != null) {
            stringJoiner.add("meterVersion=" + str4);
        }
        String str5 = this.f62260f;
        if (str5 != null) {
            stringJoiner.add("meterSchemaUrl=" + str5);
        }
        return stringJoiner.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        b bVar = this.f62255a;
        if (bVar != null ? bVar.equals(aVar.f62255a) : aVar.f62255a == null) {
            String str = this.f62256b;
            if (str != null ? str.equals(aVar.f62256b) : aVar.f62256b == null) {
                String str2 = this.f62257c;
                if (str2 != null ? str2.equals(aVar.f62257c) : aVar.f62257c == null) {
                    String str3 = this.f62258d;
                    if (str3 != null ? str3.equals(aVar.f62258d) : aVar.f62258d == null) {
                        String str4 = this.f62259e;
                        if (str4 != null ? str4.equals(aVar.f62259e) : aVar.f62259e == null) {
                            String str5 = this.f62260f;
                            if (str5 == null) {
                                if (aVar.f62260f == null) {
                                    return true;
                                }
                            } else if (str5.equals(aVar.f62260f)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        b bVar = this.f62255a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.f62256b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f62257c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f62258d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f62259e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f62260f;
        return (str5 != null ? str5.hashCode() : 0) ^ hashCode5;
    }
}
