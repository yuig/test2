package com.modiface.mfemakeupkit.video;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

/* loaded from: classes7.dex */
public final class MFEVideoRecordingError extends Throwable {
    public final EnumSet<Consequence> consequences;

    public enum Consequence {
        SkippedVideoFrame,
        SkippedAudioFrame,
        NoAudio,
        RecordingFailed
    }

    public MFEVideoRecordingError(Throwable th3, Consequence... consequenceArr) {
        super(getConsequenceString(consequenceArr), th3);
        if (consequenceArr.length <= 0) {
            this.consequences = EnumSet.noneOf(Consequence.class);
        } else {
            this.consequences = EnumSet.copyOf((Collection) Arrays.asList(consequenceArr));
        }
    }

    private static String getConsequenceString(Consequence... consequenceArr) {
        if (consequenceArr.length <= 0) {
            return "\n\tThis error has no consequence.";
        }
        StringBuilder sb3 = new StringBuilder("\n\tThis error has the following consequence(s):");
        for (Consequence consequence : consequenceArr) {
            if (consequence == null) {
                sb3.append("\n\t\t(null)");
            } else {
                int i13 = a.f34682a[consequence.ordinal()];
                if (i13 == 1) {
                    sb3.append("\n\t\trecording failed");
                } else if (i13 == 2) {
                    sb3.append("\n\t\tno audio recorded");
                } else if (i13 == 3) {
                    sb3.append("\n\t\ta video frame is skipped");
                } else if (i13 != 4) {
                    sb3.append("\n\t\t(unknown consequence)");
                } else {
                    sb3.append("\n\t\tan audio frame is skipped");
                }
            }
        }
        return sb3.toString();
    }
}
