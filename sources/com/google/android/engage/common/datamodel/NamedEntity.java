package com.google.android.engage.common.datamodel;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.engage.common.datamodel.Entity;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;

@KeepName
/* loaded from: classes3.dex */
public abstract class NamedEntity extends Entity {

    /* renamed from: f */
    public final String f30270f;

    @Keep
    public static abstract class Builder<T extends Builder> extends Entity.Builder<T> {

        @NonNull
        protected String name;

        @Override // com.google.android.engage.common.datamodel.Entity.Builder
        @NonNull
        public abstract NamedEntity build();

        @NonNull
        public T setName(@NonNull String str) {
            this.name = str;
            return this;
        }
    }

    public NamedEntity(int i13, ArrayList arrayList, String str) {
        super(i13, arrayList);
        bf.b.j("Name cannot be empty", !TextUtils.isEmpty(str));
        this.f30270f = str;
    }
}
