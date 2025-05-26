package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class qv {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41387a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41388b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("eligible_levels")
    private List<Integer> f41389c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("group_id")
    private a f41390d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("selected_level")
    private b f41391e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41392f;

    /* loaded from: classes3.dex */
    public enum a {
        FRIENDS(0),
        FOLLOWERS(1),
        FOLLOWEES(2),
        CONTACTS(3),
        OTHERS(4);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        DIRECTTOINBOX(0),
        SENDREQUEST(1),
        BLOCKED(2);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ qv(String str, String str2, List list, a aVar, b bVar, boolean[] zArr, int i13) {
        this(str, str2, list, aVar, bVar, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qv qvVar = (qv) obj;
        return Objects.equals(this.f41391e, qvVar.f41391e) && Objects.equals(this.f41390d, qvVar.f41390d) && Objects.equals(this.f41387a, qvVar.f41387a) && Objects.equals(this.f41388b, qvVar.f41388b) && Objects.equals(this.f41389c, qvVar.f41389c);
    }

    public final List f() {
        return this.f41389c;
    }

    public final a g() {
        return this.f41390d;
    }

    public final b h() {
        return this.f41391e;
    }

    public final int hashCode() {
        return Objects.hash(this.f41387a, this.f41388b, this.f41389c, this.f41390d, this.f41391e);
    }

    public qv() {
        this.f41392f = new boolean[5];
    }

    private qv(@NonNull String str, String str2, List<Integer> list, a aVar, b bVar, boolean[] zArr) {
        this.f41387a = str;
        this.f41388b = str2;
        this.f41389c = list;
        this.f41390d = aVar;
        this.f41391e = bVar;
        this.f41392f = zArr;
    }
}
