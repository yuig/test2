package com.bugsnag.android;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Breadcrumb implements n1 {
    final j impl;
    private final u1 logger;

    public Breadcrumb(@NonNull j jVar, @NonNull u1 u1Var) {
        this.impl = jVar;
        this.logger = u1Var;
    }

    private void logNull(String str) {
        this.logger.h("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    @NonNull
    public String getMessage() {
        return this.impl.f29279a;
    }

    public Map<String, Object> getMetadata() {
        return this.impl.f29281c;
    }

    @NonNull
    public String getStringTimestamp() {
        return hd.e.b(this.impl.f29282d);
    }

    @NonNull
    public Date getTimestamp() {
        return this.impl.f29282d;
    }

    @NonNull
    public BreadcrumbType getType() {
        return this.impl.f29280b;
    }

    public void setMessage(@NonNull String str) {
        if (str != null) {
            this.impl.f29279a = str;
        } else {
            logNull("message");
        }
    }

    public void setMetadata(Map<String, Object> map) {
        this.impl.f29281c = map;
    }

    public void setType(@NonNull BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.f29280b = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.n1
    public void toStream(@NonNull o1 o1Var) {
        this.impl.toStream(o1Var);
    }

    public Breadcrumb(@NonNull String str, @NonNull u1 u1Var) {
        this.impl = new j(str, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
        this.logger = u1Var;
    }

    public Breadcrumb(@NonNull String str, @NonNull BreadcrumbType breadcrumbType, Map<String, Object> map, @NonNull Date date, @NonNull u1 u1Var) {
        this.impl = new j(str, breadcrumbType, map, date);
        this.logger = u1Var;
    }
}
