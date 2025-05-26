package com.pinterest.api.model;

import java.util.List;

/* loaded from: classes3.dex */
public class jz implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("style")
    private c f39179a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("key")
    private String f39180b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("label")
    private String f39181c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("isBiz")
    private Boolean f39182d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("options")
    private List<b> f39183e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("categoryMaps")
    private List<a> f39184f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @om.b("label")
        private String f39185a;

        /* renamed from: b, reason: collision with root package name */
        @om.b("value")
        private List<b> f39186b;

        public a(String str, List<b> list) {
            this.f39185a = str;
            this.f39186b = list;
        }

        public final String a() {
            return this.f39185a;
        }

        public final List b() {
            return this.f39186b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f39185a;
            if (str == null ? aVar.f39185a != null : !str.equals(aVar.f39185a)) {
                return false;
            }
            List<b> list = this.f39186b;
            List<b> list2 = aVar.f39186b;
            return list != null ? list.equals(list2) : list2 == null;
        }

        public final int hashCode() {
            String str = this.f39185a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<b> list = this.f39186b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NotificationSettingCategoryMap{label='");
            sb3.append(this.f39185a);
            sb3.append("', value=");
            return d7.g.k(sb3, this.f39186b, '}');
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @om.b("key")
        private String f39187a;

        /* renamed from: b, reason: collision with root package name */
        @om.b("label")
        private String f39188b;

        /* renamed from: c, reason: collision with root package name */
        @om.b("value")
        private Boolean f39189c;

        public b(String str, String str2, Boolean bool) {
            this.f39187a = str;
            this.f39188b = str2;
            this.f39189c = bool;
        }

        public final String a() {
            return this.f39187a;
        }

        public final String b() {
            return this.f39188b;
        }

        public final Boolean c() {
            return this.f39189c;
        }

        public final void d(boolean z13) {
            this.f39189c = Boolean.valueOf(z13);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            String str = this.f39187a;
            if (str == null ? bVar.f39187a != null : !str.equals(bVar.f39187a)) {
                return false;
            }
            String str2 = this.f39188b;
            if (str2 == null ? bVar.f39188b != null : !str2.equals(bVar.f39188b)) {
                return false;
            }
            Boolean bool = this.f39189c;
            Boolean bool2 = bVar.f39189c;
            return bool != null ? bool.equals(bool2) : bool2 == null;
        }

        public final int hashCode() {
            String str = this.f39187a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f39188b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool = this.f39189c;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "NotificationSettingOption{key='" + this.f39187a + "', label='" + this.f39188b + "', value=" + this.f39189c + '}';
        }
    }

    public enum c {
        NOTIFICATION_SETTING_STYLE_RADIO_GROUP,
        NOTIFICATION_SETTING_STYLE_TOGGLE_GROUP,
        NOTIFICATION_SETTING_STYLE_TWO_LEVEL_SECTION,
        NOTIFICATION_SETTING_STYLE_BUTTON
    }

    public jz(c cVar, String str, String str2, Boolean bool, List<b> list, List<a> list2) {
        this.f39179a = cVar;
        this.f39180b = str;
        this.f39181c = str2;
        this.f39182d = bool;
        this.f39183e = list;
        this.f39184f = list2;
    }

    public final List a() {
        return this.f39184f;
    }

    @Override // dl1.s
    public final String b() {
        return null;
    }

    public final String c() {
        return this.f39180b;
    }

    public final String e() {
        return this.f39181c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jz jzVar = (jz) obj;
        c cVar = this.f39179a;
        if (cVar == null ? jzVar.f39179a != null : !cVar.equals(jzVar.f39179a)) {
            return false;
        }
        String str = this.f39180b;
        if (str == null ? jzVar.f39180b != null : !str.equals(jzVar.f39180b)) {
            return false;
        }
        String str2 = this.f39181c;
        if (str2 == null ? jzVar.f39181c != null : !str2.equals(jzVar.f39181c)) {
            return false;
        }
        Boolean bool = this.f39182d;
        if (bool == null ? jzVar.f39182d != null : bool != jzVar.f39182d) {
            return false;
        }
        List<b> list = this.f39183e;
        List<b> list2 = jzVar.f39183e;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final List g() {
        return this.f39183e;
    }

    public final c h() {
        return this.f39179a;
    }

    public final int hashCode() {
        c cVar = this.f39179a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f39180b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39181c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f39182d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<b> list = this.f39183e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NotificationSetting{style=");
        sb3.append(this.f39179a);
        sb3.append(", key='");
        sb3.append(this.f39180b);
        sb3.append("', label='");
        sb3.append(this.f39181c);
        sb3.append("', isBusiness=");
        sb3.append(this.f39182d);
        sb3.append(", options=");
        sb3.append(this.f39183e);
        sb3.append(", categoryMaps=");
        return d7.g.k(sb3, this.f39184f, '}');
    }
}
