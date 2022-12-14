package id.go.purbalinggakab.bumdes.model.request

import org.springframework.web.multipart.MultipartFile
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class PengurusBumdesRequest(

    @field:NotBlank
    var id_bumdes: String,

    @field:NotBlank
    var id_pengurus: String,

    @field:NotBlank
    var jabatan: String,
    )

