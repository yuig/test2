package com.google.android.engage.audio.datamodel;

import bf.b;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;

@KeepName
/* loaded from: classes3.dex */
public abstract class ResumableAudioEntity extends AudioEntity {

    /* renamed from: i, reason: collision with root package name */
    public final Integer f30236i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30237j;

    public ResumableAudioEntity(int i13, ArrayList arrayList, String str, Long l13, String str2, Integer num, int i14) {
        super(i13, arrayList, str, l13, str2);
        this.f30236i = num;
        if (num != null && num.intValue() >= 0) {
            b.j("Progress percent should be >= 0 and < 100", num.intValue() < 100);
        }
        this.f30237j = i14;
    }
}
