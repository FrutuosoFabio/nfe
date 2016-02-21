package com.fincatto.nfe310.transformers;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.simpleframework.xml.transform.RegistryMatcher;

import com.fincatto.nfe310.classes.NFAmbiente;
import com.fincatto.nfe310.classes.NFFinalidade;
import com.fincatto.nfe310.classes.NFFormaPagamentoPrazo;
import com.fincatto.nfe310.classes.NFModalidadeFrete;
import com.fincatto.nfe310.classes.NFNotaInfoCombustivelTipo;
import com.fincatto.nfe310.classes.NFNotaInfoEspecieVeiculo;
import com.fincatto.nfe310.classes.NFNotaInfoImpostoTributacaoICMS;
import com.fincatto.nfe310.classes.NFNotaInfoItemImpostoICMSModalidadeBaseCalculo;
import com.fincatto.nfe310.classes.NFNotaInfoItemModalidadeBCICMSST;
import com.fincatto.nfe310.classes.NFNotaInfoItemProdutoArmamentoTipo;
import com.fincatto.nfe310.classes.NFNotaInfoItemProdutoVeiculoCondicao;
import com.fincatto.nfe310.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi;
import com.fincatto.nfe310.classes.NFNotaInfoItemProdutoVeiculoRestricao;
import com.fincatto.nfe310.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao;
import com.fincatto.nfe310.classes.NFNotaInfoSituacaoTributariaCOFINS;
import com.fincatto.nfe310.classes.NFNotaInfoSituacaoTributariaIPI;
import com.fincatto.nfe310.classes.NFNotaInfoSituacaoTributariaPIS;
import com.fincatto.nfe310.classes.NFNotaInfoTipoVeiculo;
import com.fincatto.nfe310.classes.NFNotaInfoVeiculoCor;
import com.fincatto.nfe310.classes.NFNotaMotivoDesoneracaoICMS;
import com.fincatto.nfe310.classes.NFNotaSituacaoOperacionalSimplesNacional;
import com.fincatto.nfe310.classes.NFOrigem;
import com.fincatto.nfe310.classes.NFOrigemProcesso;
import com.fincatto.nfe310.classes.NFProcessoEmissor;
import com.fincatto.nfe310.classes.NFProdutoCompoeValorNota;
import com.fincatto.nfe310.classes.NFRegimeTributario;
import com.fincatto.nfe310.classes.NFTipo;
import com.fincatto.nfe310.classes.NFTipoEmissao;
import com.fincatto.nfe310.classes.NFTipoImpressao;
import com.fincatto.nfe310.classes.NFUnidadeFederativa;
import com.fincatto.nfe310.classes.cadastro.NFIndicadorContribuinteCTe;
import com.fincatto.nfe310.classes.cadastro.NFIndicadorContribuinteNFe;
import com.fincatto.nfe310.classes.cadastro.NFSituacaoContribuinte;
import com.fincatto.nfe310.classes.lote.envio.NFLoteIndicadorProcessamento;
import com.fincatto.nfe310.classes.nota.NFFormaImportacaoIntermediacao;
import com.fincatto.nfe310.classes.nota.NFFormaPagamentoMoeda;
import com.fincatto.nfe310.classes.nota.NFIdentificadorLocalDestinoOperacao;
import com.fincatto.nfe310.classes.nota.NFIndicadorIEDestinatario;
import com.fincatto.nfe310.classes.nota.NFIndicadorPresencaComprador;
import com.fincatto.nfe310.classes.nota.NFNotaInfoItemIndicadorExigibilidadeISS;
import com.fincatto.nfe310.classes.nota.NFNotaInfoItemIndicadorIncentivoFiscal;
import com.fincatto.nfe310.classes.nota.NFNotaInfoRegimeEspecialTributacao;
import com.fincatto.nfe310.classes.nota.NFOperacaoConsumidorFinal;
import com.fincatto.nfe310.classes.nota.NFOperadoraCartao;
import com.fincatto.nfe310.classes.nota.NFViaTransporteInternacional;

public class NFRegistryMatcher extends RegistryMatcher {

    public NFRegistryMatcher() {
        super.bind(NFTipo.class, new NFTipoTransformer());
        super.bind(NFOrigem.class, new NFOrigemTransformer());
        super.bind(NFAmbiente.class, new NFAmbienteTransformer());
        super.bind(LocalDate.class, new NFLocalDateTransformer());
        super.bind(LocalTime.class, new NFLocalTimeTransformer());
        super.bind(NFFinalidade.class, new NFFinalidadeTransformer());
        super.bind(NFTipoEmissao.class, new NFTipoEmissaoTransformer());
        super.bind(DateTime.class, new NFDateTimeTransformer());
        super.bind(LocalDateTime.class, new NFLocalDateTimeTransformer());
        super.bind(NFTipoImpressao.class, new NFTipoImpressaoTransformer());
        super.bind(NFOrigemProcesso.class, new NFOrigemProcessoTransformer());
        super.bind(NFOperadoraCartao.class, new NFOperadoraCartaoTransformer());
        super.bind(NFProcessoEmissor.class, new NFProgramaEmissorTransformer());
        super.bind(NFModalidadeFrete.class, new NFModalidadeFreteTransformer());
        super.bind(NFRegimeTributario.class, new NFRegimeTributarioTransformer());
        super.bind(NFFormaPagamentoPrazo.class, new NFFormaPagamentoTransformer());
        super.bind(NFUnidadeFederativa.class, new NFUnidadeFederativaTransformer());
        super.bind(NFNotaInfoVeiculoCor.class, new NFNotaInfoVeiculoCorTransformer());
        super.bind(NFFormaPagamentoMoeda.class, new NFFormaPagamentoMoedaTransformer());
        super.bind(NFNotaInfoTipoVeiculo.class, new NFNotaInfoTipoVeiculoTransformer());
        super.bind(NFSituacaoContribuinte.class, new NFSituacaoContribuinteTransformer());
        super.bind(NFNotaInfoEspecieVeiculo.class, new NFNotaInfoEspecieVeiculoTransformer());
        super.bind(NFProdutoCompoeValorNota.class, new NFProdutoCompoeValorNotaTransformer());
        super.bind(NFIndicadorIEDestinatario.class, new NFIndicadorIEDestinatarioTransformer());
        super.bind(NFOperacaoConsumidorFinal.class, new NFOperacaoConsumidorFinalTransformer());
        super.bind(NFNotaInfoCombustivelTipo.class, new NFNotaInfoCombustivelTipoTransformer());
        super.bind(NFIndicadorContribuinteCTe.class, new NFIndicadorContribuinteCTTransformer());
        super.bind(NFIndicadorContribuinteNFe.class, new NFIndicadorContribuinteNFeTransformer());
        super.bind(NFNotaMotivoDesoneracaoICMS.class, new NFNotaMotivoDesoneracaoICMSTransformer());
        super.bind(NFLoteIndicadorProcessamento.class, new NFLoteIndicadorProcessamentoTransformer());
        super.bind(NFViaTransporteInternacional.class, new NFViaTransporteInternacionalTransformer());
        super.bind(NFIndicadorPresencaComprador.class, new NFIndicadorPresencaCompradorTransformer());
        super.bind(NFFormaImportacaoIntermediacao.class, new NFFormaImportacaoIntermediacaoTransformer());
        super.bind(NFNotaInfoImpostoTributacaoICMS.class, new NFNotaInfoImpostoTributacaoICMSTransformer());
        super.bind(NFNotaInfoSituacaoTributariaIPI.class, new NFNotaInfoSituacaoTributariaIPITransformer());
        super.bind(NFNotaInfoSituacaoTributariaPIS.class, new NFNotaInfoSituacaoTributariaPISTransformer());
        super.bind(NFNotaInfoItemModalidadeBCICMSST.class, new NFnotaInfoItemModalidadeBCICMSSTTransformer());
        super.bind(NFNotaInfoRegimeEspecialTributacao.class, new NFNotaInfoRegimeEspecialTributacaoTransformer());
        super.bind(NFNotaInfoSituacaoTributariaCOFINS.class, new NFNotaInfoSituacaoTributariaCOFINSTransformer());
        super.bind(NFNotaInfoItemProdutoArmamentoTipo.class, new NFNotaInfoItemProdutoArmamentoTipoTransformer());
        super.bind(NFIdentificadorLocalDestinoOperacao.class, new NFIdentificadorLocalDestinoOperacaoTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoCondicao.class, new NFNotaInfoItemProdutoVeiculoCondicaoTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoRestricao.class, new NFNotaInfoItemProdutoVeiculoRestricaoTransformer());
        super.bind(NFNotaInfoItemIndicadorIncentivoFiscal.class, new NFNotaInfoItemIndicadorIncentivoFiscalTransformer());
        super.bind(NFNotaInfoItemIndicadorExigibilidadeISS.class, new NFNotaInfoItemIndicadorExigibilidadeISSTransformer());
        super.bind(NFNotaSituacaoOperacionalSimplesNacional.class, new NFNotaSituacaoOperacionalSimplesNacionalTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoTipoOperacao.class, new NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoCondicaoChassi.class, new NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer());
        super.bind(NFNotaInfoItemImpostoICMSModalidadeBaseCalculo.class, new NFNotaInfoItemImpostoICMSModalidadeBaseCalculoTransformer());
    }
}