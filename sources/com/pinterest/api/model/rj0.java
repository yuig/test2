package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class rj0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("creator")
    private wy0 f41613a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("sponsor")
    private wy0 f41614b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("status")
    private a f41615c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41616d;

    public enum a {
        REQUESTED(0),
        APPROVED(1),
        REJECTED(2),
        UNAFFILIATED(3);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ rj0(wy0 wy0Var, wy0 wy0Var2, a aVar, boolean[] zArr, int i13) {
        this(wy0Var, wy0Var2, aVar, zArr);
    }

    public final wy0 d() {
        return this.f41613a;
    }

    public final wy0 e() {
        return this.f41614b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rj0 rj0Var = (rj0) obj;
        return Objects.equals(this.f41615c, rj0Var.f41615c) && Objects.equals(this.f41613a, rj0Var.f41613a) && Objects.equals(this.f41614b, rj0Var.f41614b);
    }

    public final a f() {
        return this.f41615c;
    }

    public final int hashCode() {
        return Objects.hash(this.f41613a, this.f41614b, this.f41615c);
    }

    public rj0() {
        this.f41616d = new boolean[3];
    }

    private rj0(@NonNull wy0 wy0Var, wy0 wy0Var2, a aVar, boolean[] zArr) {
        this.f41613a = wy0Var;
        this.f41614b = wy0Var2;
        this.f41615c = aVar;
        this.f41616d = zArr;
    }
}
