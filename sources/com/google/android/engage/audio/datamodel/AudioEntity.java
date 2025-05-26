package com.google.android.engage.audio.datamodel;

import android.text.TextUtils;
import bf.b;
import com.google.android.engage.common.datamodel.ContinuationEntity;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;

@KeepName
/* loaded from: classes3.dex */
public abstract class AudioEntity extends ContinuationEntity {

    /* renamed from: h, reason: collision with root package name */
    public final String f30178h;

    public AudioEntity(int i13, ArrayList arrayList, String str, Long l13, String str2) {
        super(i13, arrayList, str, l13);
        this.f30178h = str2;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b.j("Description should not exceed 200 characters", str2.length() < 200);
    }
}
