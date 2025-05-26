package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ec {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37234a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37235b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("text")
    private String f37236c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("type")
    private a f37237d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37238e;

    /* loaded from: classes3.dex */
    public enum a {
        DELIVERY(0),
        PICKUP(1);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ ec(String str, String str2, String str3, a aVar, boolean[] zArr, int i13) {
        this(str, str2, str3, aVar, zArr);
    }

    public final String e() {
        return this.f37236c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        return Objects.equals(this.f37237d, ecVar.f37237d) && Objects.equals(this.f37234a, ecVar.f37234a) && Objects.equals(this.f37235b, ecVar.f37235b) && Objects.equals(this.f37236c, ecVar.f37236c);
    }

    public final a f() {
        return this.f37237d;
    }

    public final int hashCode() {
        return Objects.hash(this.f37234a, this.f37235b, this.f37236c, this.f37237d);
    }

    public ec() {
        this.f37238e = new boolean[4];
    }

    private ec(@NonNull String str, String str2, String str3, a aVar, boolean[] zArr) {
        this.f37234a = str;
        this.f37235b = str2;
        this.f37236c = str3;
        this.f37237d = aVar;
        this.f37238e = zArr;
    }
}
