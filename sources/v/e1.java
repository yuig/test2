package v;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class e1 {
    public static androidx.camera.core.impl.e a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new androidx.camera.core.impl.d(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new androidx.camera.core.impl.f(videoProfile.getMediaType(), videoProfile.getCodec(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return androidx.camera.core.impl.e.e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles b(int i13, String str) {
        return CamcorderProfile.getAll(str, i13);
    }

    public static int c(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f20018e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void e(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }

    public static void f(Service service, int i13, Notification notification, int i14) {
        try {
            service.startForeground(i13, notification, i14);
        } catch (ForegroundServiceStartNotAllowedException e13) {
            kb.b0.e().j(SystemForegroundService.f20023e, "Unable to start foreground service", e13);
        } catch (SecurityException e14) {
            kb.b0.e().j(SystemForegroundService.f20023e, "Unable to start foreground service", e14);
        }
    }
}
