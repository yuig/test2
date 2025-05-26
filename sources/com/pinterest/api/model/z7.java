package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class z7 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44232a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44233b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("anchor_message_in_thread")
    private mv f44234c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("conversation_id")
    private String f44235d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_eligible_for_conversation")
    private Boolean f44236e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("last_message_in_thread")
    private mv f44237f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("num_messages_in_thread")
    private Integer f44238g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f44239h;

    public /* synthetic */ z7(String str, String str2, mv mvVar, String str3, Boolean bool, mv mvVar2, Integer num, boolean[] zArr, int i13) {
        this(str, str2, mvVar, str3, bool, mvVar2, num, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f44232a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return Objects.equals(this.f44238g, z7Var.f44238g) && Objects.equals(this.f44236e, z7Var.f44236e) && Objects.equals(this.f44232a, z7Var.f44232a) && Objects.equals(this.f44233b, z7Var.f44233b) && Objects.equals(this.f44234c, z7Var.f44234c) && Objects.equals(this.f44235d, z7Var.f44235d) && Objects.equals(this.f44237f, z7Var.f44237f);
    }

    public final int hashCode() {
        return Objects.hash(this.f44232a, this.f44233b, this.f44234c, this.f44235d, this.f44236e, this.f44237f, this.f44238g);
    }

    public final mv l() {
        return this.f44234c;
    }

    public final String n() {
        return this.f44235d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f44233b;
    }

    public final Boolean q() {
        Boolean bool = this.f44236e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final mv s() {
        return this.f44237f;
    }

    public final Integer u() {
        Integer num = this.f44238g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public z7() {
        this.f44239h = new boolean[7];
    }

    private z7(@NonNull String str, String str2, mv mvVar, String str3, Boolean bool, mv mvVar2, Integer num, boolean[] zArr) {
        this.f44232a = str;
        this.f44233b = str2;
        this.f44234c = mvVar;
        this.f44235d = str3;
        this.f44236e = bool;
        this.f44237f = mvVar2;
        this.f44238g = num;
        this.f44239h = zArr;
    }
}
